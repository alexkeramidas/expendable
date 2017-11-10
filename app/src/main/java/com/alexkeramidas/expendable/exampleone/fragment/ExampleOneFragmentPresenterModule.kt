package com.alexkeramidas.expendable.exampleone.fragment

import com.alexkeramidas.expendable.scoping.PerFragment
import dagger.Binds
import dagger.Module

/**
 * com.alexkeramidas.expendable.exampleone.fragment
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */

@Module
abstract class ExampleOneFragmentPresenterModule {
    @Binds
    @PerFragment
    abstract fun exampleOneFragmentPresenter(example1PresenterImpl: ExampleOneFragmentPresenterImpl): ExampleOneFragmentPresenter
}