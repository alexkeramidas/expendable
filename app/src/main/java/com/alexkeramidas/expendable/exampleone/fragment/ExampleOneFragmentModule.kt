package com.alexkeramidas.expendable.exampleone.fragment

import android.app.Fragment
import com.alexkeramidas.expendable.base.view.BaseFragmentModule
import com.alexkeramidas.expendable.scoping.PerFragment
import dagger.Binds
import dagger.Module
import javax.inject.Named

/**
 * com.alexkeramidas.expendable.exampleone.fragment
 * Expendable
 * Created by Alexandros Keramidas on 11/10/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */

@Module(includes = arrayOf(
        BaseFragmentModule::class,
        ExampleOneFragmentPresenterModule::class
))
abstract class ExampleOneFragmentModule {
    @Binds
    @Named(BaseFragmentModule.Companion.FRAGMENT)
    @PerFragment
    abstract fun fragment(exampleOneFragment: ExampleOneFragment): Fragment

    @Binds
    @PerFragment
    abstract fun exampleOneView(exampleOneFragment: ExampleOneFragment): ExampleOneFragmentView
}