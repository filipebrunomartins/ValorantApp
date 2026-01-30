@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.valorant.app.android.library)
    alias(libs.plugins.valorant.app.android.hilt)
}
android {
    namespace = "com.valorant.app.data"

}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.di)
    api(projects.model.apiresponse)
}