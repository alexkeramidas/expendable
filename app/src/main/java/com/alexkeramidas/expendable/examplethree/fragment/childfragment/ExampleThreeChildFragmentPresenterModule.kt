package com.alexkeramidas.expendable.examplethree.fragment.childfragment

import com.alexkeramidas.expendable.scoping.PerChildFragment
import dagger.Binds
import dagger.Module

/**
 * com.alexkeramidas.expendable.examplethree.fragment.childfragment
 * Expendable
 * Created by Alexandros Keramidas on 11/10/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */

@Module
abstract class ExampleThreeChildFragmentPresenterModule {
    @Binds
    @PerChildFragment
    abstract fun exampleThreeChildFragmentPresenter(exampleThreeChildFragmentPresenterImpl: ExampleThreeChildFragmentPresenterImpl): ExampleThreeChildFragmentPresenter
}