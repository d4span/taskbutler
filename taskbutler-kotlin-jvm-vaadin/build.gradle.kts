group = "org.taskbutler"
version = "1.0-SNAPSHOT"

val kotlinversion = "1.4.32"
val kotestVersion = "4.4.3"

val vaadinVersion = "14.5.2"

val springBootVersion = "2.2.4.RELEASE"
val springDependencyManagementVersion = "1.0.9.RELEASE"

plugins {
    kotlin("jvm") version "1.4.32"

    id("com.vaadin") version "0.14.5.1"
    id("org.springframework.boot") version "2.2.4.RELEASE"
}

repositories {
    mavenCentral()
    jcenter()
}

tasks.withType<Test> {
    useJUnitPlatform()
}


dependencies {
    implementation("com.vaadin:vaadin-spring-boot-starter:$vaadinVersion")

    testImplementation("org.springframework.boot:spring-boot-devtools:$springBootVersion")
    testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion") {
        exclude("org.junit.vintage", "junit-vintage-engine")
    }
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-property:$kotestVersion")
}