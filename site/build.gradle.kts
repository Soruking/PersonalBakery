import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
    // alias(libs.plugins.kobwebx.markdown)
}

group = "com.superduperboi.website"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("Powered by Kobweb")

            head.add {
                link(rel = "stylesheet", href = "/fonts/faces.css")
            }
        }
    }
}

kotlin {
    configAsKobwebApplication("website")

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk)
                implementation(libs.silk.icons.fa)
                // implementation(libs.kobwebx.markdown)
            }
        }
    }
}
