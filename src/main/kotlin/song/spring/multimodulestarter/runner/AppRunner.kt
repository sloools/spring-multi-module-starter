package song.spring.multimodulestarter.runner

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import song.spring.multimodulestarter.autoconfigure.AboutMeConfig

@Component
class AppRunner : ApplicationRunner {
    @Autowired
    private lateinit var myConfig: AboutMeConfig

    override fun run(args: ApplicationArguments?) {
        println("================")
        println("name : ${myConfig["name"]}")
        println("age : ${myConfig["age"]}")
        println("gender : ${myConfig["gender"]}")
        println("country : ${myConfig["country"]}")
    }
}