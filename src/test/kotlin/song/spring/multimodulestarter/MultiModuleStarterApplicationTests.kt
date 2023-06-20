package song.spring.multimodulestarter

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import song.spring.multimodulestarter.autoconfigure.AboutMeConfig

@SpringBootTest
class MultiModuleStarterApplicationTests {
    @Autowired
    private lateinit var myConfig: AboutMeConfig

    @Test
    fun contextLoads() {
    }

    @Test
    fun propertiesTest() {
        assertThat(myConfig)
    }
}
