package com.wantech.medihelp.ui.emergency

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.wantech.medihelp.databinding.FragmentEmergencyBinding


class EmergencyFragment : Fragment() {
    private lateinit var binding: FragmentEmergencyBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val emergencyViewModel =
            ViewModelProvider(this)[EmergencyViewModel::class.java]

        binding = FragmentEmergencyBinding.inflate(layoutInflater)



return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setMenuVisibility(false)

    }


}