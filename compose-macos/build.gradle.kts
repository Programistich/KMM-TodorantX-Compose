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
//    macosX64 {
//        binaries {
//            executable {
//                entryPoint = "main"
//                freeCompilerArgs += listOf(
//                    "-linker-option",
//                    "-framework",
//                    "-linker-option",
//                    "Metal"
//                )
//            }
//        }
//    }
//    macosArm64 {
//        binaries {
//            executable {
//                entryPoint = "main"
//                freeCompilerArgs += listOf(
//                    "-linker-option",
//                    "-framework",
//                    "-linker-option",
//                    "Metal"
//                )
//            }
//        }
//    }
//    sourceSets {
//        val macosMain by creating {
//            dependencies {
//                api(project(":compose"))
//                implementation(compose.ui)
//                implementation(compose.foundation)
//                implementation(compose.material)
//                implementation(compose.runtime)
//            }
//        }
//        val macosX64Main by getting {
//            dependsOn(macosMain)
//        }
//        val macosArm64Main by getting {
//            dependsOn(macosMain)
//        }
//    }
//}
//
//compose.desktop.nativeApplication {
//    targets(kotlin.targets.getByName("macosX64"))
//    targets(kotlin.targets.getByName("macosArm64"))
//    distributions {
//        targetFormats(org.jetbrains.compose.desktop.application.dsl.TargetFormat.Dmg)
//        packageName = "TodorantX"
//        packageVersion = "1.0.0"
//    }
//}