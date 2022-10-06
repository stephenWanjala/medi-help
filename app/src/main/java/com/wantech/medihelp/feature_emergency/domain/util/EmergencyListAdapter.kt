package com.wantech.medihelp.feature_emergency.domain.util

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import com.wantech.medihelp.R
import com.wantech.medihelp.feature_emergency.data.datasource.EmergencyData
import com.wantech.medihelp.feature_emergency.domain.model.EmergencyModel
import com.wantech.medihelp.databinding.ImageAndTextCardBinding

class EmergencyListAdapter(
    private val context: Context

) : RecyclerView.Adapter<EmergencyListAdapter.EmergencyViewHolder>() {
    private val list: ArrayList<EmergencyModel> = EmergencyData.emergencyList


    inner class EmergencyViewHolder(private val binding: ImageAndTextCardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @RequiresApi(Build.VERSION_CODES.M)
        fun bind(emergencyModel: EmergencyModel) {

            binding.apply {
                textSpec.text = emergencyModel.emergencyType
                docImageSpec.setImageResource(emergencyModel.image)

            }

            binding.matCard.setOnCheckedChangeListener { card, isChecked ->
                if (isChecked) {
                    card.setCardBackgroundColor(
                        context
                            .getColor(R.color.text_field_bg)

                    )
                    emergencyModel.isSelected = isChecked
                } else {
                    card.setCardBackgroundColor(
                        context
                            .getColor(R.color.white)
                    )
                    emergencyModel.isSelected = isChecked
                }
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


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(holder: EmergencyViewHolder, position: Int) {
        holder.apply {

            itemView.setOnClickListener {
                onItemOnClickListener?.let { it1 ->
                    it1(
                        list[position],
                        it.findViewById(R.id.matCard)
                    )
                }!!

            }

            bind(list[position])


        }

    }

    override fun getItemCount(): Int = list.size

    private var onItemOnClickListener: ((EmergencyModel, MaterialCardView) -> Unit)? = null

    fun setOnclickListener(listener: ((EmergencyModel, MaterialCardView) -> Unit)) {
        onItemOnClickListener = listener
    }


}
