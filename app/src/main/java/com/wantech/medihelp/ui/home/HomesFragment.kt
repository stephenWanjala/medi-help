package com.wantech.medihelp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wantech.medihelp.data.DocList
import com.wantech.medihelp.data.SpecialistAdapter
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
        docAdapter = SpecialistAdapter(DocList.listOfDoctorSpecialist)
        binding.docRecyclerView.apply {
            adapter = docAdapter
            layoutManager = linearLayoutManager
        }


    }


}