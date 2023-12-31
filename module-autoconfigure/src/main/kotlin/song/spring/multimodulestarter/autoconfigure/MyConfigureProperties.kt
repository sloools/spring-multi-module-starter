package song.spring.multimodulestarter.autoconfigure

import org.springframework.boot.context.properties.ConfigurationProperties
import java.util.*

@ConfigurationProperties("my")
data class MyConfigureProperties(
    val name: String? = null,
    val age: String? = null,
    val gender: String? = null,
    val country: String? = null
)