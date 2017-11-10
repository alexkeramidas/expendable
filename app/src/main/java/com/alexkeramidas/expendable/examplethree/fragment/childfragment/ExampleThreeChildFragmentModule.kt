package com.alexkeramidas.expendable.examplethree.fragment.childfragment

import android.app.Fragment
import com.alexkeramidas.expendable.base.view.BaseChildFragmentModule
import com.alexkeramidas.expendable.scoping.PerChildFragment
import dagger.Binds
import dagger.Module
import javax.inject.Named

/**
 * com.alexkeramidas.expendable.examplethree.activity
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */

@Module(includes = arrayOf(
        BaseChildFragmentModule::class,
        ExampleThreeChildFragmentPresenterModule::class
))
abstract class ExampleThreeChildFragmentModule {
    @Binds
    @Named(BaseChildFragmentModule.Companion.CHILD_FRAGMENT)
    @PerChildFragment
    abstract fun fragment(exampleThreeChildFragment: ExampleThreeChildFragment): Fragment

    @Binds
    @PerChildFragment
    abstract fun exampleThreeChildFragmentView(exampleThreeChildFragment: ExampleThreeChildFragment): ExampleThreeChildFragmentView
}