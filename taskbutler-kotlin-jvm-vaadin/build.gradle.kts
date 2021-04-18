group = "org.taskbutler"
version = "1.0-SNAPSHOT"

val kotestVersion = "4.4.3"

plugins {
    kotlin("jvm") version "1.4.32"
}

repositories {
    mavenCentral()
}

tasks.withType<Test> {
    useJUnitPlatform()
}


dependencies {
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-property:$kotestVersion")
}