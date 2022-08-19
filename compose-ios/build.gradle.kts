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
//    iosX64("uikitX64") {
//        binaries {
//            executable {
//                entryPoint = "main"
//                freeCompilerArgs += listOf(
//                    "-linker-option", "-framework", "-linker-option", "Metal",
//                    "-linker-option", "-framework", "-linker-option", "CoreText",
//                    "-linker-option", "-framework", "-linker-option", "CoreGraphics"
//                )
//            }
//        }
//    }
//    iosArm64("uikitArm64") {
//        binaries {
//            executable {
//                entryPoint = "main"
//                freeCompilerArgs += listOf(
//                    "-linker-option", "-framework", "-linker-option", "Metal",
//                    "-linker-option", "-framework", "-linker-option", "CoreText",
//                    "-linker-option", "-framework", "-linker-option", "CoreGraphics"
//                )
//                freeCompilerArgs += "-Xdisable-phases=VerifyBitcode"
//            }
//        }
//    }
//    sourceSets {
//        val iosMain by creating {
//            dependencies {
//                implementation(project(":compose"))
//                implementation(compose.ui)
//                implementation(compose.foundation)
//                implementation(compose.material)
//                implementation(compose.runtime)
//            }
//        }
//        val uikitMain by creating {
//            dependsOn(iosMain)
//        }
//        val uikitX64Main by getting {
//            dependsOn(uikitMain)
//        }
//        val uikitArm64Main by getting {
//            dependsOn(uikitMain)
//        }
//    }
//}
//
//compose.experimental {
//    uikit.application {
//        bundleIdPrefix = "com.programistich"
//        projectName = "TodorantX"
//        deployConfigurations {
//            simulator("IPhone8") {
//                device = org.jetbrains.compose.experimental.dsl.IOSDevices.IPHONE_8
//            }
//        }
//    }
//}