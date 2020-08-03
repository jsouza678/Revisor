package com.souza.data.remote

import com.souza.data.remote.response.VehicleResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface FipeService {

    @GET("carros/marcas")
    fun loadRepositoryPageFromApiAsync(): Deferred<List<VehicleResponse>>
}
