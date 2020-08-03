package com.souza.buildSrc

object Dependencies {

    object Core {
        /**
         * https://developer.android.com/jetpack/androidx
         */
        const val appcompat: String = "androidx.appcompat:appcompat:" + Versions.app_compat

        const val core_ktx: String = "androidx.core:core-ktx:" + Versions.core_ktx

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
    }
}
