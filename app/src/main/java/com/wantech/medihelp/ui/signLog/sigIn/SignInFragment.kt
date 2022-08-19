package com.wantech.medihelp.ui.signLog.sigIn

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.wantech.medihelp.databinding.FragmentSignInBinding
import com.wantech.medihelp.Drawer


class SignInFragment : Fragment() {


    private lateinit var binding: FragmentSignInBinding
    private lateinit var viewModel: SignInViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignInBinding.inflate(layoutInflater)
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
                startActivity(Intent(requireActivity(), Drawer::class.java))
                requireActivity().finish()
            }
        }
    }


}