package com.alexkeramidas.expendable.application

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * com.alexkeramidas.expendable.application
 * Expendable
 * Created by Alexandros Keramidas on 11/8/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
@Module
class ExpendableAppModule(val app: ExpendableApplication) {
    @Provides
    @Singleton
    fun providesExpendableApplication() = app
}