plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

val buildNumber = (System.getenv("GITHUB_RUN_NUMBER") ?: "1").toInt()

android {
    namespace = "com.asjath.lastzone"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.asjath.lastzone"
        minSdk = 26
        targetSdk = 35
        versionCode = buildNumber
        versionName = "1.$buildNumber"
    }

    signingConfigs {
        create("lastzone") {
            storeFile = rootProject.file("keystore/lastzone.jks")
            storePassword = "lastzone123"
            keyAlias = "lastzone"
            keyPassword = "lastzone123"
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("lastzone")
        }
        debug {
            signingConfig = signingConfigs.getByName("lastzone")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
}
