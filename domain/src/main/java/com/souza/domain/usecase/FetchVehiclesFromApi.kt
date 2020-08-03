package com.souza.domain.usecase

import com.souza.domain.model.Vehicle
import com.souza.domain.repository.VehicleRepository

class FetchVehiclesFromApi(
    private val repository: VehicleRepository
) {
    suspend fun invoke(): List<Vehicle> = repository.getVehicles()
}
