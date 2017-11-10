package com.alexkeramidas.expendable.exampletwo.fragments.fragmentalpha

import com.alexkeramidas.expendable.scoping.PerFragment
import dagger.Binds
import dagger.Module

/**
 * com.alexkeramidas.expendable.exampletwo.fragments.fragmentalpha
 * Expendable
 * Created by Alexandros Keramidas on 11/10/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */

@Module
abstract class ExampleTwoFragmentAlphaPresenterModule {
    @Binds
    @PerFragment
    abstract fun exampleTwoFragmentAlphaPresenter(exampleTwoFragmentAlphaPresenterImpl: ExampleTwoFragmentAlphaPresenterImpl): ExampleTwoFragmentAlphaPresenter
}