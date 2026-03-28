plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    namespace = "coelho.msftauth.api"
    compileSdk = 36

    defaultConfig {
        minSdk = 26
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

// НОВЫЙ И ИДЕАЛЬНЫЙ СПОСОБ ДЛЯ KOTLIN
kotlin {
    jvmToolchain(17)
}

dependencies {
    api(libs.guava)
    api(libs.gson)
    api(libs.okhttp)
}
