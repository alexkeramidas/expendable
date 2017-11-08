package com.alexkeramidas.expendable.application

import com.alexkeramidas.expendable.main.MainComponent
import com.alexkeramidas.expendable.main.MainModule
import dagger.Component
import javax.inject.Singleton

/**
 * com.alexkeramidas.expendable.application
 * Expendable
 * Created by Alexandros Keramidas on 11/8/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
@Singleton
@Component(modules = arrayOf(
        ExpendableAppModule::class
))
interface ExpendableAppComponent {
    fun inject(app: ExpendableApplication)
    fun plus(target: MainModule): MainComponent
}