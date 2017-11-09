package com.alexkeramidas.expendable.exampleone.activity

import android.app.Activity
import com.alexkeramidas.expendable.base.BaseActivityModule
import com.alexkeramidas.expendable.exampleone.fragment.ExampleOneFragment
import com.alexkeramidas.expendable.exampleone.fragment.ExampleOneFragmentModule
import com.alexkeramidas.expendable.scoping.PerActivity
import com.alexkeramidas.expendable.scoping.PerFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * com.alexkeramidas.expendable.exampleone.activity
 * Expendable
 * Created by Alexandros Keramidas on 11/10/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
@Module(includes = arrayOf(BaseActivityModule::class))
abstract class ExampleOneActivityModule {
    @PerFragment
    @ContributesAndroidInjector(modules = arrayOf(ExampleOneFragmentModule::class))
    abstract fun exampleOneFragmentInjector(): ExampleOneFragment

    @Binds
    @PerActivity
    abstract fun activity(exampleOneActivity: ExampleOneActivity): Activity
}