@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.valorant.app.android.feature.compose)
}
android {
    namespace = "com.valorant.app.agents"
}

dependencies{
    implementation(libs.image.coil.compose)
}