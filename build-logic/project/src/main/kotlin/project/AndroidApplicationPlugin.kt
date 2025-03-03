package project

import com.android.build.api.dsl.ApplicationDefaultConfig
import extensions1.androidConfig
import extensions1.libs
import org.gradle.api.Plugin
import org.gradle.api.Project

class AndroidApplicationPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply(libs.plugins.androidApplication.get().pluginId)
                apply("android.base.config")
//                apply("android.base.test.config")
            }

            androidConfig {
                defaultConfig {
                    this as ApplicationDefaultConfig

                    targetSdk = libs.versions.targetSdk.get().toInt()
                    versionCode = libs.versions.appVersionCode.get().toInt()
                    versionName = libs.versions.appVersionName.get()
                }
            }
        }
    }

}
