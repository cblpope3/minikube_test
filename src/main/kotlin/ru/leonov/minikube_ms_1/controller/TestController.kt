package ru.leonov.minikube_ms_1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")
    fun testEndpoint(@RequestParam(required = false) message: String?): String {
        return "Hello, ${message ?: "world"}!"
    }
}