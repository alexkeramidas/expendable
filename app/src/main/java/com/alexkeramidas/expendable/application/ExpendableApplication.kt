package com.alexkeramidas.expendable.application

import android.app.Application

/**
 * com.alexkeramidas.expendable.application
 * Expendable
 * Created by Alexandros Keramidas on 11/8/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
class ExpendableApplication : Application() {
    val component: ExpendableAppComponent by lazy {
        DaggerExpendableAppComponent
                .builder()
                .expendableAppModule(ExpendableAppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }
}