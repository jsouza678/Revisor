package com.souza.data

import com.souza.data.remote.FipeService
import com.souza.domain.model.Vehicle
import com.souza.domain.repository.VehicleRepository
import com.souza.mapper.VehicleMapper

class VehicleRepositoryImpl(
    private val service: FipeService
) : VehicleRepository {

    override suspend fun getVehicles(): List<Vehicle> {
        val list = service.loadRepositoryPageFromApiAsync().await()

        return VehicleMapper.toDomainModel(list)
    }
}
