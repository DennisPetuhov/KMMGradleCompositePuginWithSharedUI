package extensions1

import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.plugin.mpp.Framework
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

fun Project.iosRegularFramework(
    block: Framework.() -> Unit
) {
    kotlinMultiplatformConfig {
        targets
            .filterIsInstance<KotlinNativeTarget>()
            .forEach { nativeTarget -> nativeTarget.binaries.framework(configure = block) }
    }
}
