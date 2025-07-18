// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.google.devtools.ksp) apply false
    alias(libs.plugins.android.room) apply false
}

buildscript {
    dependencies {
        // [Plugin] "org.jetbrains.kotlin.plugin.compose"
        classpath(libs.compose.compiler.gradle.plugin)
        classpath(libs.hilt.android.gradle.plugin)
    }
}