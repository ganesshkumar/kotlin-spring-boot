package com.ganesshkumar.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * @author Ganessh Kumar (rpganesshkumar@gmail.com)
 */

@SpringBootApplication
class DemoApplication {

}

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}
