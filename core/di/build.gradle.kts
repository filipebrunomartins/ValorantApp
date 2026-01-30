@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.valorant.app.android.library)
    alias(libs.plugins.valorant.app.android.hilt)
    alias(libs.plugins.valorant.app.android.retrofit)
}
android {
    namespace = "com.valorant.app.di"
}
dependencies {
    api(libs.log.timber)
    api(libs.bundles.network)
}
