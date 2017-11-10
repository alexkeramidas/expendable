package com.alexkeramidas.expendable.examplethree.fragment

import android.app.Fragment
import com.alexkeramidas.expendable.base.view.BaseFragmentModule
import com.alexkeramidas.expendable.examplethree.fragment.childfragment.ExampleThreeChildFragment
import com.alexkeramidas.expendable.examplethree.fragment.childfragment.ExampleThreeChildFragmentModule
import com.alexkeramidas.expendable.scoping.PerChildFragment
import com.alexkeramidas.expendable.scoping.PerFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import javax.inject.Named


/**
 * com.alexkeramidas.expendable.examplethree.activity
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */

@Module(includes = arrayOf(
        BaseFragmentModule::class,
        ExampleThreeParentFragmentPresenterModule::class
))
abstract class ExampleThreeParentFragmentModule {
    @PerChildFragment
    @ContributesAndroidInjector(modules = arrayOf(ExampleThreeChildFragmentModule::class))
    abstract fun exampleThreeChildFragmentInjector(): ExampleThreeChildFragment

    @Binds
    @Named(BaseFragmentModule.Companion.FRAGMENT)
    @PerFragment
    abstract fun fragment(exampleThreeParentFragment: ExampleThreeParentFragment): Fragment

    @Binds
    @PerFragment
    abstract fun exampleThreeParentFragmentView(exampleThreeParentFragment: ExampleThreeParentFragment): ExampleThreeParentFragmentView
}