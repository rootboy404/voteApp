package com.example.voteapp.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.voteapp.utils.Validator

class LoginViewModel : ViewModel() {
    val cpf = MutableLiveData<String>()

    fun formIsValid(): Boolean{
        return Validator.EMAIL.validate(cpf.value) == null
    }

}