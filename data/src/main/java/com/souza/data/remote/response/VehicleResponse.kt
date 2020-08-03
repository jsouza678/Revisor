package com.souza.data.remote.response

import com.squareup.moshi.Json

data class VehicleResponse(
    @Json(name = "codigo") val id: Int,
    @Json(name = "nome") val name: String?
)
