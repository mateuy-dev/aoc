package com.mateuyabar.aoc.util

fun String.splitByAnySpace() = trim().split("\\s+".toRegex())


/**
 * Sample:
 *    val (num, letter) = """(\d{8})-([A-Z])""".toRegex().extractFromRegexOrFail("12345678-Z")
 */
fun Regex.extractFromRegexOrFail(text: String) =
    matchEntire(text)!!.destructured

