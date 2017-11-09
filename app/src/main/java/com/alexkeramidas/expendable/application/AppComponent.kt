package com.alexkeramidas.expendable.application

import dagger.Component
import javax.inject.Singleton

/**
 * com.alexkeramidas.expendable.application
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app: App)
}