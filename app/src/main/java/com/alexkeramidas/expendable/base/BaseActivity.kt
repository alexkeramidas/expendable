package com.alexkeramidas.expendable.base

import android.app.Activity
import android.app.Fragment
import android.app.FragmentManager
import android.os.Bundle
import android.support.annotation.IdRes
import android.support.annotation.Nullable
import com.alexkeramidas.expendable.base.BaseActivityModule.Companion.ACTIVITY_FRAGMENT_MANAGER
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasFragmentInjector
import javax.inject.Inject
import javax.inject.Named


/**
 * com.alexkeramidas.expendable.application
 * Expendable
 * Created by Alexandros Keramidas on 09/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
abstract class BaseActivity : Activity(), HasFragmentInjector {
    @Inject
    @Named(ACTIVITY_FRAGMENT_MANAGER)
    lateinit protected var fragmentManager: FragmentManager


    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun fragmentInjector(): AndroidInjector<Fragment> {
        return fragmentInjector
    }

    protected fun addFragment(@IdRes containerViewId: Int, fragment: Fragment) {
        fragmentManager.beginTransaction()
                .add(containerViewId, fragment)
                .commit()
    }
}