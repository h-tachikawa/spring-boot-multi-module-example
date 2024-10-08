plugins {
    // 作成したローカルプラグインは通常のプラグインと同様にid()で読み込める
    id("java-common-conventions")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-web-services")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
