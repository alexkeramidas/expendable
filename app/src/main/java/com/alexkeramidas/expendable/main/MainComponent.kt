package com.alexkeramidas.expendable.main

import dagger.Subcomponent

/**
 * com.alexkeramidas.expendable.main
 * Expendable
 * Created by Alexandros Keramidas on 11/8/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */

@Subcomponent(modules = arrayOf(MainModule::class))
@MainScope
interface MainComponent {
    fun inject(mainActivity: MainActivity)
}