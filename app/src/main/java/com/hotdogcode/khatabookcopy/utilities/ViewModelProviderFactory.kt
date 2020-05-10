package com.hotdogcode.khatabookcopy.utilities

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelProviderFactory<V:Any>(private val v: V) : ViewModelProvider.Factory {


    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(v::class.java)){
            return v as T
        }
        throw ClassNotFoundException("View Model Provider Factory. View Model is-> ${modelClass.simpleName}")
    }
}