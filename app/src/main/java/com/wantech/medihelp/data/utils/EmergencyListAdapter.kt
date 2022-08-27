package com.wantech.medihelp.data.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wantech.medihelp.data.EmergencyData
import com.wantech.medihelp.data.EmergencyModel
import com.wantech.medihelp.databinding.ImageAndTextCardBinding

class EmergencyListAdapter(
    private val context: Context

) : RecyclerView.Adapter<EmergencyListAdapter.EmergencyViewHolder>() {
    private val list: ArrayList<EmergencyModel> = EmergencyData.emergencyList


    inner class EmergencyViewHolder(private val binding: ImageAndTextCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(emergencyModel: EmergencyModel) {
            binding.apply {
                textSpec.text = emergencyModel.emergencyType
                docImageSpec.setImageResource(emergencyModel.image)

            }
        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmergencyViewHolder =
        EmergencyViewHolder(
            ImageAndTextCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )


    override fun onBindViewHolder(holder: EmergencyViewHolder, position: Int) {
        holder.apply {
            bind(list[position])
            itemView.setOnClickListener {
                onItemOnClickListener?.let { it1 -> it1(list[position]) }
            }
        }

    }


    override fun getItemCount(): Int = list.size

    private var onItemOnClickListener: ((EmergencyModel) -> Unit)? = null

    fun setOnclickListener(listener: ((EmergencyModel) -> Unit)) {
        onItemOnClickListener = listener
    }


}
