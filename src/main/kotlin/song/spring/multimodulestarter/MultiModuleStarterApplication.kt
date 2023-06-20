package song.spring.multimodulestarter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MultiModuleStarterApplication

fun main(args: Array<String>) {
    runApplication<MultiModuleStarterApplication>(*args)
}
