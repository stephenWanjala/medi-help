package com.wantech.medihelp.ui.signLog.sigUp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.wantech.medihelp.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {

    companion object {
        fun newInstance() = SignUpFragment()
    }

    private lateinit var binding: FragmentSignUpBinding
    private lateinit var viewModel: SignUpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignUpBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            acceptTermsCheckBox.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    binding.signUpButton.isEnabled = !binding.signUpButton.isEnabled
                } else {
                    binding.signUpButton.isEnabled = false
                }
            }

            privacyAndPolicyBtn.setOnClickListener {
                findNavController().navigate(SignUpFragmentDirections.actionNavSignUpToPrivacyPolicyFragment())
            }
        }


    }



}