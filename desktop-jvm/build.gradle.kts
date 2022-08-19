//plugins {
//    id("org.jetbrains.compose")
//    kotlin("multiplatform")
//}
//
//repositories {
//    google()
//    mavenCentral()
//    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
//}
//
//kotlin {
//    jvm("desktop")
//    sourceSets {
//        val desktopMain by getting {
//            dependencies {
//                implementation(project(":compose"))
//                implementation(compose.desktop.currentOs)
//            }
//        }
//    }
//}
//
//
//compose.desktop {
//    application {
//        mainClass = "Main_desktopKt"
//
//        nativeDistributions {
//            targetFormats(
//                org.jetbrains.compose.desktop.application.dsl.TargetFormat.Dmg,
//                org.jetbrains.compose.desktop.application.dsl.TargetFormat.Msi,
//                org.jetbrains.compose.desktop.application.dsl.TargetFormat.Deb
//            )
//            packageName = "TodorantX"
//            packageVersion = "1.0.0"
//        }
//    }
//}