import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("java-common-conventions")
    id("org.springframework.boot")
}

dependencies {
    implementation(project(":domain:todo"))
}

tasks.getByName<BootJar>("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
}
