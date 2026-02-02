import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test
import org.gradle.testing.jacoco.plugins.JacocoPluginExtension
import org.gradle.testing.jacoco.tasks.JacocoReport
import org.gradle.kotlin.dsl.*

class AndroidJacocoConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply("jacoco")

            extensions.configure<JacocoPluginExtension> {
                toolVersion = "0.8.11"
            }

            tasks.withType<Test>().configureEach {
                extensions.configure<org.gradle.testing.jacoco.plugins.JacocoTaskExtension> {
                    isIncludeNoLocationClasses = true
                    excludes = listOf("jdk.internal.*")
                }
            }

            // Relatório padrão
            tasks.register<JacocoReport>("jacocoTestReport") {
                dependsOn("testDebugUnitTest")

                reports {
                    html.required.set(true)
                    xml.required.set(true)
                    csv.required.set(false)
                }

                val fileFilter = listOf(
                    "**/R.class",
                    "**/R$*.class",
                    "**/BuildConfig.*",
                    "**/Manifest*.*",
                    "**/*Test*.*",
                    "**/Hilt_*.*",
                    "**/*_Factory.*"
                )

                val kotlinClasses = fileTree(
                    "$buildDir/tmp/kotlin-classes/debug"
                ) {
                    exclude(fileFilter)
                }

                val javaClasses = fileTree(
                    "$buildDir/intermediates/javac/debug"
                ) {
                    exclude(fileFilter)
                }

                classDirectories.setFrom(files(kotlinClasses, javaClasses))

                sourceDirectories.setFrom(
                    files(
                        "src/main/java",
                        "src/main/kotlin"
                    )
                )

                executionData.setFrom(
                    fileTree(buildDir) {
                        include(
                            "jacoco/testDebugUnitTest.exec",
                            "outputs/unit_test_code_coverage/debugUnitTest/testDebugUnitTest.exec"
                        )
                    }
                )
            }
        }
    }
}