package br.com.zup.bff

import br.com.zup.beagle.constants.BEAGLE_EXPOSED_HEADERS
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
open class CorsConfig : WebMvcConfigurer {
  override fun addCorsMappings(registry: CorsRegistry) {
    registry.addMapping("/**").exposedHeaders(*BEAGLE_EXPOSED_HEADERS)
  }
}

@SpringBootApplication
class BffApplication

fun main(args: Array<String>) {
  runApplication<BffApplication>(*args)
}
