package com.example.prak10.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory

import com.example.prak10.MahasiswaApplications


object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer { HomeViewModel(MahasiswaApplications().container.mahasiswaRepository)}
        initializer { InsertViewModel(MahasiswaApplications().container.mahasiswaRepository)}
    }
}

fun CreationExtras.MahasiswaApplications(): MahasiswaApplications =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as MahasiswaApplications)
