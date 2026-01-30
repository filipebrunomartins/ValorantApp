@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    alias(libs.plugins.valorant.app.android.library)
    alias(libs.plugins.valorant.app.android.hilt)
}

android {
    namespace = "com.valorant.app.domain"
}

dependencies {
    api(projects.model.entity)
    implementation(libs.androidx.corektx)
    implementation(libs.kotlinx.coroutines.android)
}