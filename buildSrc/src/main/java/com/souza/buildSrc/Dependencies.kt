package com.souza.buildSrc

object Dependencies {

    object Core {
        /**
         * https://developer.android.com/jetpack/androidx
         */
        const val appcompat: String = "androidx.appcompat:appcompat:" + Versions.app_compat

        const val core_ktx: String = "androidx.core:core-ktx:" + Versions.core_ktx

        const val coroutines_android: String =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:" + Versions.coroutines

        const val coroutines_core: String =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:" + Versions.coroutines

        const val lifecycle: String =
            "android.arch.lifecycle:extensions:" + Versions.lifecycle

        const val view_model: String = "androidx.lifecycle:lifecycle-viewmodel-ktx:" + Versions.view_model
        /**
         * https://kotlinlang.org/
         */
        const val kotlin_stdlib: String = "org.jetbrains.kotlin:kotlin-stdlib:" + Versions.kotlin

        const val kotlin_stdlib_jdk7: String =
            "org.jetbrains.kotlin:kotlin-stdlib-jdk7:" + Versions.kotlin

        const val legacy_support: String =
            "androidx.legacy:legacy-support-v4:" + Versions.legacy_support
    }

    object Module {
        const val app = ":app"
        const val resource_components = ":resource-components"
        const val domain = ":domain"
        const val data = ":data"
        const val vehiclescatalog = ":vehiclescatalog"
    }

    object Remote {
        const val moshi: String = "com.squareup.moshi:moshi:" + Versions.moshi
        const val moshi_kotlin: String = "com.squareup.moshi:moshi-kotlin:" + Versions.moshi

        /**
         * https://github.com/square/retrofit/
         */
        const val retrofit: String = "com.squareup.retrofit2:retrofit:" + Versions.retrofit

        const val okhttp_logging_interceptor: String = "com.squareup.okhttp3:logging-interceptor:" +
                Versions.okhttp_logging_interceptor

        const val moshi_converter: String = "com.squareup.retrofit2:converter-moshi:" + Versions.retrofit

        /**
         * https://github.com/JakeWharton/retrofit2-kotlin-coroutines-adapter/
         */
        const val retrofit2_coroutines_adapter: String =
            "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:" +
                    Versions.retrofit2_coroutines_adapter
    }

    object DI {
        /**
         * https://github.com/InsertKoinIO/koin
         */
        const val koin: String = "org.koin:koin-android:" + Versions.koin

        const val koin_core: String = "org.koin:koin-core:" + Versions.koin

        const val koin_view_model: String =
            "org.koin:koin-androidx-viewmodel:" + Versions.koin
    }

    object Plugin {

        const val kotlin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:" + Versions.kotlin
        /**
         * https://github.com/pinterest/ktlint
         */
        const val ktlint: String = "com.pinterest:ktlint:" + Versions.ktlint
    }
    object Testing {
        /**
         * http://junit.org
         */
        const val junit: String = "junit:junit:" + Versions.junit
        const val junit_android: String = "androidx.test.ext:junit:" + Versions.junit_android
    }
    object Tool {

        const val gradle: String = "com.android.tools.build:gradle:" + Versions.gradle
    }

    object UI {
        const val constraint_layout: String = "androidx.constraintlayout:constraintlayout:" +
                Versions.constraint_layout

        const val material: String = "com.google.android.material:material:" + Versions.material
        /**
         * AndroidX Components and Tools
         * https://developer.android.com/jetpack/androidx
         */
        const val recycler_view: String =
            "androidx.recyclerview:recyclerview:" + Versions.recycler_view
    }
}
