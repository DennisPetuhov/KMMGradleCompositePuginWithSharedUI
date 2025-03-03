import extensions1.androidConfig

plugins {
    id("android.base.config")
}

androidConfig {
    buildFeatures {
        //enables a Compose tooling support in the AndroidStudio
        compose = true
    }
}
