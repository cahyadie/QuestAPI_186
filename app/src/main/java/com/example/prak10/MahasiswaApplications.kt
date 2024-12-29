package com.example.prak10

import android.app.Application
import com.example.prak10.Repository.AppContainer
import com.example.prak10.Repository.MahasiswaContainer

class MahasiswaApplications: Application()  {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MahasiswaContainer()
    }
}