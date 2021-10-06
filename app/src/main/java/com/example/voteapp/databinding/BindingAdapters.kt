package com.example.voteapp.databinding

import com.google.android.material.textfield.TextInputLayout
import androidx.databinding.BindingAdapter
import com.example.voteapp.utils.Validator

object BindingAdapters {

    @BindingAdapter("validator", "model", requireAll = true)
    @JvmStatic
    fun validate(input: TextInputLayout, validator: Validator, model: String?) {
        input.error = with(validator.validate(model, input.context.applicationContext)){
            if(input.isDirty && this != null) this else null
        }
    }
}