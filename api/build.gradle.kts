plugins {
    id("spring-conventions")
}

dependencies {
    implementation(project(":domain:project")) // domain:projectを呼ぶために必要
    implementation(project(":domain:todo")) // domain:todoを呼ぶために必要
}
