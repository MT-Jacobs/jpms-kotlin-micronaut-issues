plugins {
    id("org.jetbrains.kotlin.kapt")
    id("io.micronaut.application")
}

micronaut {
    runtime("netty")
    testRuntime("junit5")
    processing {
        incremental(true)
        annotations("com.example.*")
    }
}

application {
    mainModule.set("com.example")
    mainClass.set("com.example.ApplicationKt")
}

