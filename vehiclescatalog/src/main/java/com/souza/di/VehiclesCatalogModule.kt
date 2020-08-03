package com.souza.di

import com.souza.domain.usecase.FetchVehiclesFromApi
import com.souza.vehiclescatalog.VehiclesCatalogAdapter
import com.souza.vehiclescatalog.VehiclesCatalogViewModel
import kotlinx.coroutines.CoroutineDispatcher
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val vehiclesCatalogModule = module {

    viewModel {
        VehiclesCatalogViewModel(
            get<FetchVehiclesFromApi>(),
            get<CoroutineDispatcher>()
        )
    }

    factory {
        VehiclesCatalogAdapter()
    }
}
