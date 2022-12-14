plugins {
    id("com.android.application")
    kotlin("android")
    id("org.jetbrains.compose")
}

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(project(":compose"))

    implementation(compose.ui)
    implementation(compose.foundation)
    implementation(compose.material)
    implementation(compose.runtime)

    implementation("androidx.appcompat:appcompat:1.5.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
    implementation("androidx.activity:activity-compose:1.5.1")
    implementation("androidx.activity:activity-ktx:1.5.1")
    implementation("androidx.core:core-ktx:1.8.0")
}

android {
    compileSdk = 32

    defaultConfig {
        applicationId = "com.programistich.todorantx"
        minSdk = 21
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        compose = true
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}
