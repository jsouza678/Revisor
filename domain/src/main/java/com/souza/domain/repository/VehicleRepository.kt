package com.souza.domain.repository

import com.souza.domain.model.Vehicle

interface VehicleRepository {

    suspend fun getVehicles(): List<Vehicle>
}
