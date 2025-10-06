// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    // Declara o plugin de aplicação Android, mas não o aplica aqui (apply false)
    alias(libs.plugins.android.application) apply false
    // Declara o plugin do Kotlin para Android
    alias(libs.plugins.kotlin.android) apply false
    // Declara o plugin do KSP
    alias(libs.plugins.google.ksp) apply false
}