package com.costanzopa.plugins

import com.costanzopa.routes.customerRouting
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        customerRouting()
    }
}
