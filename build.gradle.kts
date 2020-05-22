plugins {

    id("org.jetbrains.kotlin.jvm") version "1.3.70"
}

group = "me.rajmahendra.orchid.theme"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
}

dependencies {

    implementation(kotlin("stdlib-jdk8"))

    val orchidVersion = "0.20.0"

    implementation("io.github.javaeden.orchid:OrchidCore:$orchidVersion")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}