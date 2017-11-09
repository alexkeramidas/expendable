package com.alexkeramidas.expendable.base

import android.app.Fragment
import android.app.FragmentManager
import com.alexkeramidas.expendable.scoping.PerFragment
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * com.alexkeramidas.expendable.base
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */

@Module
abstract class BaseFragmentModule {
    @Module
    companion object {

        const val FRAGMENT = "BaseFragmentModule.fragment"
        const val CHILD_FRAGMENT_MANAGER = "BaseFragmentModule.childFragmentManager"

        @JvmStatic
        @Provides
        @Named(CHILD_FRAGMENT_MANAGER)
        @PerFragment
        fun childFragmentManager(@Named(FRAGMENT) fragment: Fragment): FragmentManager {
            return fragment.childFragmentManager
        }

    }

}
