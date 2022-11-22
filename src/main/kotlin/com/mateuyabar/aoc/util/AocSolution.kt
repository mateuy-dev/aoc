package com.mateuyabar.aoc.util

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.cookies.*
import io.ktor.client.request.*
import io.ktor.client.request.forms.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.coroutines.runBlocking
import java.nio.file.Path
import kotlin.io.path.createDirectories
import kotlin.io.path.exists
import kotlin.io.path.readText
import kotlin.io.path.writeText

abstract class AocSolution(val exercice: AocExercice) {
    constructor(year: Int, day: Int, level: Int, sampleInput: String = "", sampleOutput : String = ""): this(
        AocExercice(year, day, level, sampleInput, sampleOutput)
    )

    val url = "https://adventofcode.com/${exercice.year}/day/${exercice.day}"
    val inputPath = Path.of("src/main/resources/${exercice.year}/${exercice.day}.input")
    val client = HttpClient(CIO) {
        install(HttpCookies) {
            val cookie = Cookie(
                name = "session",
                value = Secrets.sessionToken,
                domain = "adventofcode.com",
            )
            storage = ConstantCookiesStorage(cookie)
        }
    }


    abstract fun calculate(input: String): String

    fun run(){
        testSample()
        val result = calculate(getAocInput().dropLast(1))
        println("### RESULT ###")
        println(result)
    }

    private fun testSample() {
        exercice.samples.forEach{ sample->
            if(sample.input.isNotEmpty()) {
                val result = calculate(sample.input)
                require(result == sample.output, {"Sample test failing: $result should be $sample.output"})
            }
        }
    }



    private suspend fun downloadAocInput(): String {
        return client.get("$url/input").bodyAsText()
    }

    fun getAocInput(): String {
        runBlocking {
            saveAocInput()
        }
        return inputPath.readText()
    }

    suspend fun saveAocInput() {
        if (!inputPath.exists()) {
            inputPath.parent.createDirectories()
            val input = downloadAocInput()
            inputPath.writeText(input)
        }
    }



    fun submit(answer: String): Boolean = runBlocking {
        val response = client.submitForm("$url/answer",
            formParameters = Parameters.build {
                append("level", "level")
                append("answer", "answer")
            }
        ).bodyAsText()
        println(response)

        response.contains("[Continue to Part Two]")
    }
}
