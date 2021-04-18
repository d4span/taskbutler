group = "org.taskbutler"
version = "1.0-SNAPSHOT"

val kotestVersion = "4.4.3"
val vaadinVersion = "14.+"

plugins {
    kotlin("jvm") version "1.4.32"
    id("com.vaadin") version "0.17.0.1"
}

repositories {
    mavenCentral()
    jcenter()
}

tasks.withType<Test> {
    useJUnitPlatform()
}


dependencies {
    implementation("com.vaadin:vaadin-core:$vaadinVersion")

    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-property:$kotestVersion")
}