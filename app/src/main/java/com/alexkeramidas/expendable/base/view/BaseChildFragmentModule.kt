package com.alexkeramidas.expendable.base.view

import dagger.Module

/**
 * com.alexkeramidas.expendable.base.view
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
@Module
abstract class BaseChildFragmentModule {
    companion object {
        const val CHILD_FRAGMENT = "BaseChildFragmentModule.childFragment"
    }
}