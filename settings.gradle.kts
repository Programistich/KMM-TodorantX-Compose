pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id.startsWith("com.android")) {
                useModule("com.android.tools.build:gradle:7.2.2")
            }
            if (requested.id.id.startsWith("org.jetbrains.kotlin")) {
                // klib not support in 1.7.10
                useVersion("1.6.21")
            }
            if (requested.id.id.startsWith("org.jetbrains.compose")) {
                useVersion("1.2.0-alpha01-dev725")
            }
        }
    }
}

rootProject.name = "TodorantX"
include(":android")
include(":common:compose")
