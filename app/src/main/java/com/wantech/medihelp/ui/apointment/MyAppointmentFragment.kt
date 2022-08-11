package com.wantech.medihelp.ui.apointment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wantech.medihelp.R

class MyAppointmentFragment : Fragment() {

    companion object {
        fun newInstance() = MyAppointmentFragment()
    }

    private lateinit var viewModel: MyAppointmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_appointment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyAppointmentViewModel::class.java)
        // TODO: Use the ViewModel
    }

}