package com.costanzopa

import com.costanzopa.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>): Unit = io.ktor.server.jetty.EngineMain.main(args)

fun Application.module() {
    configureRouting()
    configureSerialization()
}
