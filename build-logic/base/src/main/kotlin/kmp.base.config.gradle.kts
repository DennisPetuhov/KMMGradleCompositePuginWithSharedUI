plugins {
    id("org.jetbrains.kotlin.multiplatform")
//    alias(libs.plugins.kotlinMultiplatform)
}

//kotlin {
//    androidTarget()
//
//    jvm()
//
//    iosX64()
//    iosArm64()
//    iosSimulatorArm64()
//}

kotlin {
    androidTarget {
//        @OptIn(ExperimentalKotlinGradlePluginApi::class)
//        compilerOptions {
//            jvmTarget.set(JvmTarget.JVM_17)
//        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "Shared"
            isStatic = true
        }
    }
}