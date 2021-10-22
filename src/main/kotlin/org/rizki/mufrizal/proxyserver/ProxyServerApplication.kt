package org.rizki.mufrizal.proxyserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProxyServerApplication

fun main(args: Array<String>) {
	runApplication<ProxyServerApplication>(*args)
}
