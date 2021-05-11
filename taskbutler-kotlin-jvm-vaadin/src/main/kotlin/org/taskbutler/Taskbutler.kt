package org.taskbutler

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
open class Taskbutler : SpringBootServletInitializer()

fun main() {
    SpringApplication.run(Taskbutler::class.java)
}