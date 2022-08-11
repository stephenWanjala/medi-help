package com.wantech.medihelp.ui.home

import android.os.Bundle
import android.view.*
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wantech.medihelp.R
import com.wantech.medihelp.data.DocList
import com.wantech.medihelp.data.SpecialistAdapter
import com.wantech.medihelp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager
    private lateinit var docAdapter: SpecialistAdapter
    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]

        binding = FragmentHomeBinding.inflate(layoutInflater)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        linearLayoutManager =
            LinearLayoutManager(this@HomeFragment.context, LinearLayoutManager.HORIZONTAL, false)
        docAdapter = SpecialistAdapter(DocList.listOfDoctorSpecialist)
        binding.docRecyclerView.apply {
            adapter = docAdapter
            layoutManager = linearLayoutManager
        }


    }




}