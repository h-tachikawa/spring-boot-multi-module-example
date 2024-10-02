plugins {
    id("spring-conventions")
}

dependencies {
    implementation(project(":domain:project"))
    implementation(project(":domain:todo"))
}
