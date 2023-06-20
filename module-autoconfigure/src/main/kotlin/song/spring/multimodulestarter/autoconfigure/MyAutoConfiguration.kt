package song.spring.multimodulestarter.autoconfigure

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(value = [MyConfigureProperties::class])
open class MyAutoConfiguration(
    private val myConfigureProperties: MyConfigureProperties
) {
    @Bean
    @ConditionalOnMissingBean
    open fun myConfig(): AboutMeConfig {
        val myName = myConfigureProperties.name ?: "Song"
        val myAge = myConfigureProperties.age ?: "31"
        val myGender = myConfigureProperties.gender ?: "Male"
        val myCountry = myConfigureProperties.country ?: "Korea"

        val config = AboutMeConfig()
        config["name"] = myName
        config["age"] = myAge
        config["gender"] = myGender
        config["country"] = myCountry

        return config
    }
}