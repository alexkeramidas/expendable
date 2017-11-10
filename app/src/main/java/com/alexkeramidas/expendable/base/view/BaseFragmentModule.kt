package com.alexkeramidas.expendable.base.view

import android.app.Fragment
import android.app.FragmentManager
import com.alexkeramidas.expendable.scoping.PerFragment
import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * com.alexkeramidas.expendable.base.view
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
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
