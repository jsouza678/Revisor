package com.souza.revisor

import android.app.Application
import com.souza.di.dataModule
import com.souza.di.domainModule
import com.souza.di.vehiclesCatalogModule
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.logger.AndroidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.EmptyLogger
import org.koin.core.logger.Logger

class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@Application)
            logger(koinLogger())
            modules(
                modules = listOf(
                    domainModule,
                    vehiclesCatalogModule,
                    dataModule
                )
            )
        }
    }

    private fun koinLogger(): Logger = if (BuildConfig.DEBUG) AndroidLogger() else EmptyLogger()
}
