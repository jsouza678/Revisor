package com.souza.vehiclescatalog

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.souza.domain.model.Vehicle
import com.souza.domain.usecase.FetchVehiclesFromApi
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch

class VehiclesCatalogViewModel(
    private val fetchVehiclesFromApi: FetchVehiclesFromApi,
    private val coroutineScope: CoroutineDispatcher
) : ViewModel() {

    private val _result = MutableLiveData<List<Vehicle>>()
    val result: LiveData<List<Vehicle>> = _result

    init {
        viewModelScope.launch(coroutineScope) {
            _result.postValue(fetchVehiclesFromApi.invoke())
        }
    }
}
