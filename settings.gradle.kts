pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://www.jitpack.io")
    }
}

rootProject.name = "ValorantApp"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include (":app")
include(":core:di")
include(":core:domain")
include(":core:data")
include(":model:entity")
include(":model:apiresponse")

include(":common")
include(":core:designsystem")
include(":core:ui")

include(":features:repolist")
include(":features:profile")

include(":features:agents")
include(":features:maps")
include(":features:weapons")
include(":features:home")
