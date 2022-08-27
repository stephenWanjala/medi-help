package com.wantech.medihelp.data.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wantech.medihelp.R
import com.wantech.medihelp.data.Hospitals

class HospitalsAdapter : RecyclerView.Adapter<HospitalsAdapter.HospitalsViewHolder>() {
    private val hosList = Hospitals.hospitals

    inner class HospitalsViewHolder(private val itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val hospitalLocation: TextView = itemView.findViewById(R.id.hospitalLocation)
        val hospitalHotline: TextView = itemView.findViewById(R.id.hospitalHotline)
        val hospitalImage: ImageView = itemView.findViewById(R.id.hospitalImage)
        val hospitalName: TextView = itemView.findViewById(R.id.hospitalName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HospitalsViewHolder {
        return HospitalsViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(
                    R.layout.hospital_emergency_item_layout,
                    parent, false
                )
        )
    }

    override fun onBindViewHolder(holder: HospitalsViewHolder, position: Int) {
        holder.apply {
            hospitalName.text = hosList[position].hospitalName
            hospitalHotline.text = hosList[position].contactHotLine
            hospitalLocation.text = hosList[position].hospitalLocation
            hospitalImage.setImageResource(hosList[position].samplePicturesInt)
        }
    }

    override fun getItemCount(): Int {
        return hosList.size
    }
}