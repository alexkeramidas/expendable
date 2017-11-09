package com.alexkeramidas.expendable.main.activity

import android.app.Activity
import com.alexkeramidas.expendable.base.BaseActivityModule
import com.alexkeramidas.expendable.main.fragments.MainFragment
import com.alexkeramidas.expendable.main.fragments.MainFragmentListener
import com.alexkeramidas.expendable.main.fragments.MainFragmentModule
import com.alexkeramidas.expendable.scoping.PerActivity
import com.alexkeramidas.expendable.scoping.PerFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * com.alexkeramidas.expendable.main.activity
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
@Module(includes = arrayOf(BaseActivityModule::class))
abstract class MainActivityModule {

    @PerFragment
    @ContributesAndroidInjector(modules = arrayOf(MainFragmentModule::class))
    abstract fun mainFragmentInjector(): MainFragment

    @Binds
    @PerActivity
    abstract fun activity(mainActivity: MainActivity): Activity

    @Binds
    @PerActivity
    abstract fun mainFragmentListener(mainActivity: MainActivity): MainFragmentListener

}