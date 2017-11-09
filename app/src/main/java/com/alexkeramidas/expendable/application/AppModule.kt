package com.alexkeramidas.expendable.application

import com.alexkeramidas.expendable.exampleone.activity.ExampleOneActivity
import com.alexkeramidas.expendable.exampleone.activity.ExampleOneActivityModule
import com.alexkeramidas.expendable.examplethree.activity.ExampleThreeActivity
import com.alexkeramidas.expendable.examplethree.activity.ExampleThreeActivityModule
import com.alexkeramidas.expendable.exampletwo.activity.ExampleTwoActivity
import com.alexkeramidas.expendable.exampletwo.activity.ExampleTwoActivityModule
import com.alexkeramidas.expendable.main.activity.MainActivity
import com.alexkeramidas.expendable.main.activity.MainActivityModule
import com.alexkeramidas.expendable.scoping.PerActivity
import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.android.ContributesAndroidInjector


/**
 * com.alexkeramidas.expendable.application
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
@Module(includes = arrayOf(AndroidInjectionModule::class))
abstract class AppModule {
    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun mainActivity(): MainActivity

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(ExampleOneActivityModule::class))
    abstract fun exampleOneActivity(): ExampleOneActivity

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(ExampleTwoActivityModule::class))
    abstract fun exampleTwoActivity(): ExampleTwoActivity

    @PerActivity
    @ContributesAndroidInjector(modules = arrayOf(ExampleThreeActivityModule::class))
    abstract fun exampleThreeActivity(): ExampleThreeActivity
}