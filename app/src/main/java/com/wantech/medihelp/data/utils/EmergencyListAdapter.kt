package com.wantech.medihelp.data.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wantech.medihelp.R
import com.wantech.medihelp.data.EmergencyData

class EmergencyListAdapter() : RecyclerView.Adapter<EmergencyListAdapter.EmergencyViewHolder>() {
    private val list = EmergencyData.emergencyList

    inner class EmergencyViewHolder(private val itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.docImageSpec)
        val text: TextView = itemView.findViewById(R.id.textSpec)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmergencyViewHolder {
        return EmergencyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.image_and_text_card, parent, false)
        )
    }

    override fun onBindViewHolder(holder: EmergencyViewHolder, position: Int) {
        holder.apply {
            image.setImageResource(list[position].image)
            text.text = list[position].emergencyType
        }
    }

    override fun getItemCount(): Int {
       return list.size
    }
}