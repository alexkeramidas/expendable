package com.alexkeramidas.expendable.main

import com.alexkeramidas.expendable.application.PerFragment
import com.alexkeramidas.expendable.main.overview.OverviewFragment
import com.alexkeramidas.expendable.main.overview.OverviewModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * com.alexkeramidas.expendable.main
 * Expendable
 * Created by Alexandros Keramidas on 11/8/2017.
 * Copyright (c) 2017 Alex Keramidas. All rights reserved.
 */
@Module abstract class MainModule {
    @PerFragment
    @ContributesAndroidInjector(modules = arrayOf(OverviewModule::class))
    abstract fun overviewFragmentInjector(): OverviewFragment
}