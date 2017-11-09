package com.alexkeramidas.expendable.base

import android.app.Fragment
import android.app.FragmentManager
import com.alexkeramidas.expendable.application.PerFragment
import dagger.Module
import dagger.Provides
import javax.inject.Named


/**
 * com.alexkeramidas.expendable.base
 * Expendable
 * Created by Alexandros Keramidas on 09/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
@Module
abstract class BaseFragmentModule {
    companion object {

        const val FRAGMENT = "BaseFragmentModule.fragment"
        const val CHILD_FRAGMENT_MANAGER = "BaseFragmentModule.childFragmentManager"

        @Provides
        @Named(CHILD_FRAGMENT_MANAGER)
        @PerFragment
        internal fun childFragmentManager(@Named(FRAGMENT) fragment: Fragment): FragmentManager {
            return fragment.getChildFragmentManager()
        }
    }
}