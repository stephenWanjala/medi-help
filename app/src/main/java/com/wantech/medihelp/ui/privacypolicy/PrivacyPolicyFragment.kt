package com.wantech.medihelp.ui.privacypolicy

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.wantech.medihelp.R
import com.wantech.medihelp.databinding.FragmentPrivacyPolicyBinding

class PrivacyPolicyFragment : Fragment() {

private lateinit var binding: FragmentPrivacyPolicyBinding
    private lateinit var viewModel: PrivacyPolicyViewModel
    var accepted=false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentPrivacyPolicyBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.acceptBtn.setOnClickListener {
          accepted=true
            savedInstanceState?.putBoolean("accepted",accepted)
        }
        super.onViewCreated(view, savedInstanceState)

    }



}