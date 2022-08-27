package com.wantech.medihelp.data.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wantech.medihelp.R
import com.wantech.medihelp.data.DocList
import com.wantech.medihelp.data.models.Doctor
import com.wantech.medihelp.databinding.HealthCareTempResBinding

class HealthCareAdapter : RecyclerView.Adapter<HealthCareAdapter.HealthCareViewHolder>() {
    private val listOfHealthCareDocs = DocList.listOfDoctors

    inner class HealthCareViewHolder(private val binding: HealthCareTempResBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(doctor: Doctor) {
            binding.apply {
                doctorName.text = doctor.doctorName
                areaOfSpecialization.text = doctor.specialization.specialization
                hospitalImage.setImageResource(doctor.personImage ?: R.drawable.ic_doctor)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HealthCareViewHolder =
        HealthCareViewHolder(
            HealthCareTempResBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    override fun onBindViewHolder(holder: HealthCareViewHolder, position: Int) =
        holder.bind(listOfHealthCareDocs[position])

    override fun getItemCount(): Int = listOfHealthCareDocs.size
}