package com.alexkeramidas.expendable.application

import dagger.Module
import dagger.android.AndroidInjectionModule


/**
 * com.alexkeramidas.expendable.application
 * Expendable
 * Created by Alexandros Keramidas on 11/8/2017.
 * Copyright (c) 2017 Alex Keramidas. All rights reserved.
 */
@Module(includes = arrayOf(AndroidInjectionModule::class))
abstract class ExpendableApplicationModule {

}