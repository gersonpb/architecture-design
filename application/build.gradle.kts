plugins {
    id("java")
}

group = "com.openbaking.application"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":domain"))
    implementation ("io.vavr:vavr:0.10.4")
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testImplementation ("org.mockito:mockito-junit-jupiter:5.3.1")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.9.2")

}

tasks.test {
    useJUnitPlatform()
}