import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.20-M1"
    id("org.jetbrains.kotlin.plugin.allopen") version "1.5.20-M1"
    id("com.github.johnrengelman.shadow") version "6.1.0"
    id("io.micronaut.application") version "1.3.4" apply false
    id("org.javamodularity.moduleplugin") version "1.8.7" apply false
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "kotlin")
    apply(plugin = "com.github.johnrengelman.shadow")
    apply(plugin = "org.javamodularity.moduleplugin")

    version = "0.1"
    group = "com.example"


    val kotlinVersion : String by project

    dependencies {
        implementation("io.micronaut:micronaut-validation")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${kotlinVersion}")
        implementation("org.jetbrains.kotlin:kotlin-reflect:${kotlinVersion}")
        implementation("io.micronaut.kotlin:micronaut-kotlin-runtime")
        implementation("io.micronaut:micronaut-runtime")
        implementation("io.micronaut:micronaut-http-client")
        implementation("io.micronaut.kotlin:micronaut-kotlin-extension-functions")
        runtimeOnly("ch.qos.logback:logback-classic")
        runtimeOnly("com.fasterxml.jackson.module:jackson-module-kotlin")
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_11
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
    }

}