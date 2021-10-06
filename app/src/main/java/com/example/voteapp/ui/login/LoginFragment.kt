package com.example.voteapp.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.voteapp.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var dataBinding : FragmentLoginBinding

    private val viewModel: LoginViewModel by lazy {
        ViewModelProvider(this).get(LoginViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dataBinding = FragmentLoginBinding.inflate(inflater, container, false)
        //dataBinding.viewModel = viewModel
        dataBinding.lifecycleOwner = this
        return dataBinding.root
    }



}