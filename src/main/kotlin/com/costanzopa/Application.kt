package com.costanzopa

import io.ktor.server.engine.*
import io.ktor.server.jetty.*
import com.costanzopa.plugins.*

fun main() {
    embeddedServer(Jetty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSerialization()
    }.start(wait = true)
}
