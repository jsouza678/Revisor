package com.souza.di

import com.souza.domain.repository.VehicleRepository
import com.souza.domain.usecase.FetchVehiclesFromApi
import org.koin.dsl.module

val domainModule = module {

    factory {
        FetchVehiclesFromApi(
            get<VehicleRepository>()
        )
    }
}
