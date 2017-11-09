package com.alexkeramidas.expendable.exampletwo.activity

import android.app.Activity
import com.alexkeramidas.expendable.base.BaseActivityModule
import com.alexkeramidas.expendable.exampletwo.fragments.fragmentalpha.ExampleTwoFragmentAlpha
import com.alexkeramidas.expendable.exampletwo.fragments.fragmentalpha.ExampleTwoFragmentAlphaModule
import com.alexkeramidas.expendable.exampletwo.fragments.fragmentbeta.ExampleTwoFragmentBeta
import com.alexkeramidas.expendable.scoping.PerActivity
import com.alexkeramidas.expendable.scoping.PerFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * com.alexkeramidas.expendable.exampletwo.activity
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */

@Module(includes = arrayOf(BaseActivityModule::class))
abstract class ExampleTwoActivityModule {
    @PerFragment
    @ContributesAndroidInjector(modules = arrayOf(ExampleTwoFragmentAlphaModule::class))
    abstract fun exampleTwoFragmentAlphaInjector(): ExampleTwoFragmentAlpha

    @PerFragment
    @ContributesAndroidInjector(modules = arrayOf(ExampleTwoFragmentBetaModule::class))
    abstract fun exampleTwoFragmentBetaInjector(): ExampleTwoFragmentBeta

    @Binds
    @PerActivity
    abstract fun activity(exampleTwoActivity: ExampleTwoActivity): Activity
}