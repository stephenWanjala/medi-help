package com.wantech.medihelp.feature_hospital.presentation.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.wantech.medihelp.feature_hospital.domain.util.HospitalsAdapter
import com.wantech.medihelp.databinding.FragmentHospitalsBinding


class HospitalsFragment : Fragment() {
    private lateinit var binding: FragmentHospitalsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHospitalsBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.hospitalsRec.apply {
            adapter = HospitalsAdapter()
            layoutManager = LinearLayoutManager(requireContext())
        }
    }
}