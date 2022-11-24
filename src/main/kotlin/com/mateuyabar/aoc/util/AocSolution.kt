package com.mateuyabar.aoc.util

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.cookies.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.client.request.forms.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.coroutines.runBlocking
import kotlin.io.path.*

abstract class AocSolution(val exercice: AocExercice) {
    constructor(year: Int, day: Int, level: Int, sampleInput: String = "", sampleOutput: String = "") : this(
        AocExercice(year, day, level, sampleInput, sampleOutput)
    )

    val url = "https://adventofcode.com/${exercice.year}/day/${exercice.day}"
    val inputPath = Path("src/main/resources/${exercice.year}/${exercice.day}.input")
    val client = HttpClient(OkHttp) {
        install(HttpCookies) {
            val cookie = Cookie(
                name = "session",
                value = Secrets.sessionToken,
                domain = "adventofcode.com",
            )
            storage = ConstantCookiesStorage(cookie)
        }
        //install(Logging)
        BrowserUserAgent()
    }


    abstract fun calculate(input: String): String

    fun run() {
        testSample()
        val result = calculate(getAocInput().dropLast(1))
        println("### RESULT - ${exercice.day} ${exercice.level} ###")
        println(result)
    }

    private fun testSample() {
        exercice.samples.forEach { sample ->
            if (sample.input.isNotEmpty()) {
                val result = calculate(sample.input)
                require(result == sample.output, { "Sample test failing: $result should be ${sample.output}" })
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

        val response = client.submitForm(
            url = "$url/answer",
            formParameters = Parameters.build {
                append("level", exercice.level.toString())
                append("answer", answer)
            },
            encodeInQuery = false
            )
        val text = response.bodyAsText()
        println(text)

        text.contains("[Continue to Part Two]")
    }
}
