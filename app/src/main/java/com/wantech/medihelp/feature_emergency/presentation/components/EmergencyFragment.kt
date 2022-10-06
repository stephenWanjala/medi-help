package com.wantech.medihelp.feature_emergency.presentation.components

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.wantech.medihelp.R
import com.wantech.medihelp.feature_emergency.domain.util.EmergencyListAdapter
import com.wantech.medihelp.feature_doctor.domain.util.HealthCareAdapter
import com.wantech.medihelp.feature_hospital.domain.util.HospitalsAdapter
import com.wantech.medihelp.databinding.FragmentEmergencyBinding


class EmergencyFragment :
    Fragment() {
    private lateinit var binding: FragmentEmergencyBinding
    private lateinit var emergencyListAdapter: EmergencyListAdapter
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEmergencyBinding.inflate(layoutInflater)
        emergencyListAdapter = EmergencyListAdapter(context = requireContext())

        return binding.root
    }


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.emergencyRecyclerView
            .apply {
                adapter = emergencyListAdapter
                layoutManager = LinearLayoutManager(
                    requireContext(),
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
            }
        binding.emergencyItemListRec.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = HospitalsAdapter()
        }
        handleItemClick()

    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun handleItemClick() {

        emergencyListAdapter.setOnclickListener { emergencyModel ,card->

            if (emergencyModel.isSelected){
                card.setCardBackgroundColor(requireContext()
                    .getColor(R.color.text_field_bg))
                emergencyModel.isSelected =!emergencyModel.isSelected
            } else{
                card.setCardBackgroundColor(requireContext()
                    .getColor(R.color.white))
                emergencyModel.isSelected =!emergencyModel.isSelected
            }
            when (emergencyModel.emergencyType) {
                "Hospital" -> {
                    binding.emergencyItemListRec.apply {
                        layoutManager = LinearLayoutManager(requireContext())
                        adapter = HospitalsAdapter()

                    }

                }
                "Ambulance" -> {
                    binding.emergencyItemListRec.apply {


                    }

                }

                "Doctor" -> {
                    binding.emergencyItemListRec.apply {
                        adapter = HealthCareAdapter()
                        layoutManager = LinearLayoutManager(requireContext())
                    }

                }

                "healthCare" -> {
                    binding.emergencyItemListRec.apply {
                        adapter = HealthCareAdapter()
                        layoutManager = LinearLayoutManager(requireContext())
                    }

                }


            }

        }

    }


}