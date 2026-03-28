android {
    namespace = "coelho.msftauth.api"
    compileSdk = 36

    defaultConfig {
        minSdk = 26
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    // ИСПРАВЛЕНИЕ ТУТ: Понижаем до 17
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    // ДОБАВЛЕНО: Указываем цель для Kotlin
    kotlinOptions {
        jvmTarget = "17"
    }
}
