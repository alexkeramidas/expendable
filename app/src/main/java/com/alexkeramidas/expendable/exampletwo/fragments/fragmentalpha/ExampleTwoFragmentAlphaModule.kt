package com.alexkeramidas.expendable.exampletwo.fragments.fragmentalpha

import android.app.Fragment
import com.alexkeramidas.expendable.base.BaseFragmentModule
import com.alexkeramidas.expendable.scoping.PerFragment
import dagger.Binds
import dagger.Module
import javax.inject.Named

/**
 * com.alexkeramidas.expendable.exampletwo.activity
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */

@Module(includes = arrayOf(BaseFragmentModule::class))
abstract class ExampleTwoFragmentAlphaModule {
    @Binds
    @Named(BaseFragmentModule.Companion.FRAGMENT)
    @PerFragment
    abstract fun fragment(exampleTwoFragmentAlpha: ExampleTwoFragmentAlpha): Fragment
}