plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    namespace = "com.mojang.minecraftpe"
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
    implementation(libs.androidx.room.runtime)
    kapt(libs.androidx.room.compiler)
    implementation(libs.okhttp)
    implementation(libs.gson)
    implementation(libs.material)
    implementation(libs.appcompat)
}
