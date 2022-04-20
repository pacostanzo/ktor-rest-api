package com.costanzopa.plugins

import com.costanzopa.routes.customerRouting
import com.costanzopa.routes.getOrderRoute
import com.costanzopa.routes.listOrdersRoute
import com.costanzopa.routes.totalizeOrderRoute
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
