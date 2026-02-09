import com.valorant.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.testing.Test
import org.gradle.testing.jacoco.plugins.JacocoPluginExtension
import org.gradle.testing.jacoco.tasks.JacocoReport
import org.gradle.kotlin.dsl.*

class AndroidJacocoConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {

        with(target) {
            // Aplica o plugin oficial do JaCoCo
            apply(plugin = "jacoco")

            // Configuração do JaCoCo
            extensions.configure<JacocoPluginExtension> {
                toolVersion = libs.findVersion("jacoco").get().toString()
            }

            // Task de relatório de coverage para Unit Tests
            tasks.register<JacocoReport>("jacocoTestReport") {

                // Garante que os testes rodem antes
                dependsOn("testDebugUnitTest")

                reports {
                    html.required.set(true)
                    xml.required.set(true)
                    csv.required.set(false)
                }

                // Classes compiladas (Kotlin)
                classDirectories.setFrom(
                    fileTree("$buildDir/tmp/kotlin-classes/debug") {
                        exclude(
                            "**/R.class",
                            "**/R$*.class",
                            "**/BuildConfig.*",
                            "**/di/**",
                            "**/*_Factory*",
                            "**/*_Hilt*"
                        )
                    }
                )

                // Código fonte
                sourceDirectories.setFrom(
                    files(
                        "src/main/java",
                        "src/main/kotlin"
                    )
                )

                // Arquivo gerado pelo JaCoCo após rodar os testes
                executionData.setFrom(
                    fileTree(buildDir) {
                        include("jacoco/testDebugUnitTest.exec")
                    }
                )
            }
        }
    }
}