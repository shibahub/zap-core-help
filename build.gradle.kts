plugins {
    id("com.diffplug.spotless") version "6.11.0"
}

allprojects {
    apply(plugin = "com.diffplug.spotless")

    repositories {
        mavenCentral()
    }

    spotless {
        kotlinGradle {
            ktlint()
        }
    }
}
