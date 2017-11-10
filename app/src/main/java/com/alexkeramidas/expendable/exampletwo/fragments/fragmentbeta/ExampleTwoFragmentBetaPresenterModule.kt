package com.alexkeramidas.expendable.exampletwo.fragments.fragmentbeta

import com.alexkeramidas.expendable.scoping.PerFragment
import dagger.Binds
import dagger.Module

/**
 * com.alexkeramidas.expendable.exampletwo.fragments.fragmentbeta
 * Expendable
 * Created by Alexandros Keramidas on 11/10/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */

@Module
abstract class ExampleTwoFragmentBetaPresenterModule {
    @Binds
    @PerFragment
    abstract fun exampleTwoFragmentBetaPresenter(exampleTwoFragmentBetaPresenterImpl: ExampleTwoFragmentBetaPresenterImpl): ExampleTwoFragmentBetaPresenter
}