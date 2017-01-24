package com.ganesshkumar.demo.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Ganessh Kumar (rpganesshkumar@gmail.com)
 */

@RestController
class DemoController {
    @GetMapping("/")
    fun welcome() = "Hello World!"
}