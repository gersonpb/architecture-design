buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath ("org.flywaydb:flyway-mysql:9.11.0")
    }
}

plugins {
    id ("java")
    id ("application")
    id("org.springframework.boot") version "3.3.1"
    id ("io.spring.dependency-management") version "1.1.0"
    id ("org.flywaydb.flyway") version ("9.11.0")
}

group = "com.openbaking.infrastructure"
version = "1.0-SNAPSHOT"

base {
    archivesName = "application"
    distsDirectory.set(file("${rootProject}/libs"))
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":application"))

    implementation("mysql:mysql-connector-java:8.0.28")


    implementation("org.springframework.boot:spring-boot-starter-web") {
        exclude(module =  "spring-boot-starter-tomcat")
    }

    runtimeOnly ("com.h2database:h2")

    implementation("org.springframework.boot:spring-boot-starter-undertow")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.flywaydb:flyway-core")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

flyway {
    url = System.getenv("FLYWAY_DB") ?: "jdbc:mysql://localhost:3306/adm_videos"
    user = System.getenv("FLYWAY_USER") ?: "root"
    password = System.getenv("FLYWAY_PASS") ?: "123456"
}

tasks.test {
    useJUnitPlatform()
}