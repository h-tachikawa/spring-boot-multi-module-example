plugins {
    `kotlin-dsl` // Kotlinで conventional plugin を書くために必要
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:2.7.6")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.10")
}
