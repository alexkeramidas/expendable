package com.alexkeramidas.expendable.examplethree.fragment

import com.alexkeramidas.expendable.scoping.PerFragment
import dagger.Binds
import dagger.Module

/**
 * com.alexkeramidas.expendable.examplethree.fragment
 * Expendable
 * Created by Alexandros Keramidas on 11/10/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */

@Module
abstract class ExampleThreeParentFragmentPresenterModule {
    @Binds
    @PerFragment
    abstract fun exampleThreeParentFragmentPresenter(exampleThreeParentFragmentPresenterImpl: ExampleThreeParentFragmentPresenterImpl): ExampleThreeParentFragmentPresenter
}