package com.wantech.medihelp.ui.signLog.sigIn

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.wantech.medihelp.MainActivity
import com.wantech.medihelp.R
import com.wantech.medihelp.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    companion object {
        fun newInstance() = SignInFragment()
    }
private  lateinit var binding: FragmentSignInBinding
    private lateinit var viewModel: SignInViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSignInBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            toSignUp.setOnClickListener {
                findNavController()
                    .navigate(SignInFragmentDirections.actionNavSignInToNavSignUp())
            }

            toForgotPassword.setOnClickListener {
                findNavController()
                    .navigate(SignInFragmentDirections.actionNavSignInToNavForgotPassword())
            }
            signInButton.setOnClickListener {
                startActivity(Intent(requireActivity(),MainActivity::class.java))
                requireActivity().finish()
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SignInViewModel::class.java)
        // TODO: Use the ViewModel
    }

}