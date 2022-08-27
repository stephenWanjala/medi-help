package com.wantech.medihelp.ui.emergency

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.wantech.medihelp.data.utils.EmergencyListAdapter
import com.wantech.medihelp.data.utils.HealthCareAdapter
import com.wantech.medihelp.data.utils.HospitalsAdapter
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

    private fun handleItemClick() {

        emergencyListAdapter.setOnclickListener { emergencyModel ->

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