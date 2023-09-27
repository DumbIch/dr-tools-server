package com.dumdumbich.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/home") {
            call.respondText("Hello World!")
        }
    }
}
