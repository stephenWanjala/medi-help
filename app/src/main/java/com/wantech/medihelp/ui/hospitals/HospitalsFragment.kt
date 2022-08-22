package com.wantech.medihelp.ui.hospitals

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wantech.medihelp.R
import com.wantech.medihelp.data.utils.HospitalsAdapter
import com.wantech.medihelp.databinding.FragmentHospitalsBinding


class HospitalsFragment : Fragment() {
    private lateinit var binding:FragmentHospitalsBinding
//    private lateinit var  hospitalsRec:RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      val view=inflater.inflate(R.layout.fragment_hospitals,container,false)
       val  hospitalsRec:RecyclerView=view.findViewById(R.id.hospitals_rec)
        hospitalsRec.apply {
            adapter=HospitalsAdapter()
            layoutManager=LinearLayoutManager(requireContext())
        }
        return  view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }


}