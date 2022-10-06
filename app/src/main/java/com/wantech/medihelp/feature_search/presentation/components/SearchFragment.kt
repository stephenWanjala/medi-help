package com.wantech.medihelp.feature_search.presentation.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.wantech.medihelp.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {

    private lateinit var binding: FragmentSearchBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val searchViewModel =
            ViewModelProvider(this)[SearchViewModel::class.java]

        binding = FragmentSearchBinding.inflate(inflater, container, false)


        return binding.root
    }


}