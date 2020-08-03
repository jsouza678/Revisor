package com.souza.vehiclescatalog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.souza.domain.model.Vehicle
import com.souza.vehiclescatalog.databinding.ListItemBinding

class VehiclesCatalogAdapter : RecyclerView.Adapter<VehiclesCatalogAdapter.ViewHolder>() {

    private val vehicle = mutableListOf<Vehicle>()

    fun submitList(newList: List<Vehicle>) {
        if (vehicle.isNotEmpty()) {
            vehicle.clear()
        }

        vehicle.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.list_item,
                parent,
                false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return vehicle.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemBind(vehicle[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ListItemBinding.bind(itemView)

        fun itemBind(vehicle: Vehicle) {
            fillData(vehicle)
        }

        private fun fillData(vehicle: Vehicle) {
            binding.tvCar.text = vehicle.name
        }
    }
}
