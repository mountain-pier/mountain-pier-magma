package com.mountainpier.magma

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MagmaApplication

fun main(args: Array<String>) {
	runApplication<MagmaApplication>(*args)
}
