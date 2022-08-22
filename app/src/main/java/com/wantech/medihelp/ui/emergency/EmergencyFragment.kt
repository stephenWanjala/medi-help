package com.wantech.medihelp.ui.emergency

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wantech.medihelp.R
import com.wantech.medihelp.data.utils.EmergencyListAdapter


class EmergencyFragment : Fragment() {
    //    private lateinit var binding: FragmentEmergencyBinding
    private lateinit var emergencyRecyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val rootView = inflater.inflate(R.layout.fragment_emergency, container, false)
        emergencyRecyclerView=rootView.findViewById(R.id.emergency_recyclerView)

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        emergencyRecyclerView
            .apply {
                adapter = EmergencyListAdapter()
                layoutManager = LinearLayoutManager(
                    requireContext(),
                    LinearLayoutManager.HORIZONTAL,
                    false
                )

            }


    }


}