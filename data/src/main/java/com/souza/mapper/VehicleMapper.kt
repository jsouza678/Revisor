package com.souza.mapper

import com.souza.data.remote.response.VehicleResponse
import com.souza.domain.model.Vehicle

class VehicleMapper {

    companion object {

        fun toDomainModel(vehicleResponse: List<VehicleResponse>): List<Vehicle> {
            return vehicleResponse.map { vehicleResponseList ->
                Vehicle(
                    id = vehicleResponseList.id,
                    name = vehicleResponseList.name
                )
            }
        }
    }
}
