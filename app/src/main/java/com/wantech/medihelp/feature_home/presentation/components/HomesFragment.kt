package com.wantech.medihelp.feature_home.presentation.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wantech.medihelp.feature_doctor.data.datasource.DocList
import com.wantech.medihelp.feature_doctor.domain.util.SpecialistAdapter
import com.wantech.medihelp.databinding.FragmentHHomeBinding

class HomesFragment : Fragment() {
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager
    private lateinit var docAdapter: SpecialistAdapter
    private lateinit var binding: FragmentHHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHHomeBinding.inflate(layoutInflater)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        linearLayoutManager =
            LinearLayoutManager(this@HomesFragment.context, LinearLayoutManager.HORIZONTAL, false)
        docAdapter = SpecialistAdapter(DocList.listOfDoctorSpecialistsGroups)
        binding.docRecyclerView.apply {
            adapter = docAdapter
            layoutManager = linearLayoutManager
        }


    }


}