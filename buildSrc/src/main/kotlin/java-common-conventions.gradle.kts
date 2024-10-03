plugins {
    java
    kotlin("jvm")
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib")) // Kotlin標準ライブラリ
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

// Javaの設定をtoolchainに寄せる
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
