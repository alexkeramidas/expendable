package com.alexkeramidas.expendable.application

import dagger.Component
import javax.inject.Singleton

/**
 * com.alexkeramidas.expendable.application
 * Expendable
 * Created by Alexandros Keramidas on 11/8/2017.
 * Copyright (c) 2017 Alex Keramidas. All rights reserved.
 */
@Singleton
@Component(modules = arrayOf(ExpendableApplicationModule::class))
interface ExpendableApplicationComponent {
    fun inject(app: ExpendableApplication)
}