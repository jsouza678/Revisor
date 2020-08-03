package com.souza.vehiclescatalog

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.souza.vehiclescatalog.databinding.FragmentCatalogVehiclesBinding
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class VehiclesCatalogActivity : AppCompatActivity() {

    private val viewModel by viewModel<VehiclesCatalogViewModel>()
    private val adapter by inject<VehiclesCatalogAdapter>()
    private lateinit var binding: FragmentCatalogVehiclesBinding

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
        binding = FragmentCatalogVehiclesBinding.inflate(layoutInflater)

        binding.recyclerViewMock.setHasFixedSize(true)
        binding.recyclerViewMock.adapter = adapter

        initObservers()

        setContentView(binding.root)
    }

    private fun initObservers() {
        viewModel.apply {
            this.result.observe(this@VehiclesCatalogActivity, Observer {
                adapter.submitList(it)
                Log.d("Api", "$it")
            })
        }
    }
}
