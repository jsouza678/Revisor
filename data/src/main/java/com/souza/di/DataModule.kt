package com.souza.di

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.souza.data.VehicleRepositoryImpl
import com.souza.data.remote.FipeService
import com.souza.domain.repository.VehicleRepository
import com.souza.utils.Constants.Companion.BASE_URL
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Dispatchers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

const val RETROFIT_INSTANCE = "RETROFIT"
const val OKHTTP_INSTANCE = "OKHTTP"

@Suppress("RemoveExplicitTypeArguments", "USELESS_CAST")
val dataModule = module {

    single(named(RETROFIT_INSTANCE)) {
        createRetrofit(
            get<OkHttpClient>(named(OKHTTP_INSTANCE))
        )
    }

    single(named(OKHTTP_INSTANCE)) {
        createOkHttpClient()
    }

    factory {
        VehicleRepositoryImpl(
            get<FipeService>()
        ) as VehicleRepository
    }

    factory {
        getCoroutinesDispatcher()
    }

    single {
        getFipeService(
            get<Retrofit>(named(RETROFIT_INSTANCE))
        )
    }
}

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private fun createRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .addCallAdapterFactory(CoroutineCallAdapterFactory())
    .client(okHttpClient)
    .baseUrl(BASE_URL)
    .build()

fun createOkHttpClient(): OkHttpClient {
    val httpLoggingInterceptor = HttpLoggingInterceptor()
    httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BASIC
    return OkHttpClient.Builder()
        .addInterceptor(httpLoggingInterceptor).build()
}

private fun getCoroutinesDispatcher() = Dispatchers.IO

private fun getFipeService(
    retrofit: Retrofit
): FipeService = retrofit
    .create(FipeService::class.java)
