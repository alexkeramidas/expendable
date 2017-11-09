package com.alexkeramidas.expendable.base

import dagger.Module

/**
 * com.alexkeramidas.expendable.base
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
@Module
abstract class BaseChildFragmentModule {
    companion object {
        const val CHILD_FRAGMENT = "BaseChildFragmentModule.childFragment"
    }
}