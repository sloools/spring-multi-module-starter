dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.springframework.kafka:spring-kafka:2.8.0")

    testImplementation("org.springframework.kafka:spring-kafka-test")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}