package com.alexkeramidas.expendable.examplethree.activity

import android.app.Activity
import com.alexkeramidas.expendable.base.BaseActivityModule
import com.alexkeramidas.expendable.examplethree.fragment.ExampleThreeParentFragment
import com.alexkeramidas.expendable.examplethree.fragment.ExampleThreeParentFragmentModule
import com.alexkeramidas.expendable.scoping.PerActivity
import com.alexkeramidas.expendable.scoping.PerFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * com.alexkeramidas.expendable.examplethree.activity
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */

@Module(includes = arrayOf(BaseActivityModule::class))
abstract class ExampleThreeActivityModule {
    @PerFragment
    @ContributesAndroidInjector(modules = arrayOf(ExampleThreeParentFragmentModule::class))
    abstract fun exampleThreeParentFragmentInjector(): ExampleThreeParentFragment

    @Binds
    @PerActivity
    abstract fun activity(examplethreeActivity: ExampleThreeActivity): Activity
}