//package com.mateuyabar.aoc.util
//
//
//import kotlinx.serialization.decodeFromString
//import kotlinx.serialization.json.Json
//import java.nio.file.Path
//import java.security.Key
//import java.util.*
//import javax.crypto.Cipher
//import javax.crypto.spec.IvParameterSpec
//import javax.crypto.spec.SecretKeySpec
//import kotlin.io.path.notExists
//import kotlin.io.path.readText
//
//
//class SecretsStorage(val name : String, val path: Path) {
//    private val algorithm = "AES"
//
//    fun getValue(key: String) : String? {
//        val value = System.getenv(envKeyFor(key))
//        return if(value==null){
//            loadDataToEnv()
//            System.getenv(envKeyFor(key))
//        } else {
//            value
//        }
//    }
//
//    private fun loadDataToEnv() {
//        if(path.notExists()){
//            println("##########################")
//            println("Secrets not found")
//            println("##########################")
//        }
//        println("##########################")
//        println("Loading secrets...")
//        println("##########################")
//        println("Enter secret storage key")
//        val password = readln()
//        val json = path.readText().decrypt(password)
//        val values = Json.decodeFromString<Map<String, String>>(json)
//        storeInEnv(values)
//    }
//
//    private fun storeInEnv(values: Map<String, String>) {
//        values.forEach{
//            System.s
//        }
//    }
//
//    private fun envKeyFor(key: String) = "$name\\_$key"
//
//    fun addValue(key: String, value: Any){
//
//    }
//
//    fun String.encrypt(password: String): String {
//        val key: Key = generateKey(password)
//        val c = Cipher.getInstance(algorithm)
//        c.init(Cipher.ENCRYPT_MODE, key)
//        val encryptedValue = c.doFinal(this.toByteArray())
//        return Base64.getEncoder().encodeToString(encryptedValue)
//    }
//
//
//    fun String.decrypt(password: String): String {
//        val key: Key = generateKey(password)
//        val c = Cipher.getInstance(algorithm)
//        c.init(Cipher.DECRYPT_MODE, key)
//        val decordedValue: ByteArray = Base64.getDecoder().decode(this)
//        val decValue = c.doFinal(decordedValue)
//        return String(decValue)
//    }
//
//    private fun generateKey(password: String): Key {
//        return SecretKeySpec(password.toByteArray(), algorithm)
//    }
//}