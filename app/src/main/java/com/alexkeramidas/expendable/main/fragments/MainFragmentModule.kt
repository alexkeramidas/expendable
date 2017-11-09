package com.alexkeramidas.expendable.main.fragments

import android.app.Fragment
import com.alexkeramidas.expendable.base.BaseFragmentModule
import com.alexkeramidas.expendable.scoping.PerFragment
import dagger.Binds
import dagger.Module
import javax.inject.Named

/**
 * com.alexkeramidas.expendable.main
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */

@Module(includes = arrayOf(BaseFragmentModule::class))
abstract class MainFragmentModule {
    @Binds
    @Named(BaseFragmentModule.Companion.FRAGMENT)
    @PerFragment
    abstract fun fragment(mainFragment: MainFragment): Fragment
}