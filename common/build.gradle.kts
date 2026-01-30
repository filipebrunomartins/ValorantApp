@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.valorant.app.android.library)
}
android {
    namespace = "com.valorant.app.common"
}
dependencies {
}