package com.alexkeramidas.expendable.base

import android.app.Activity
import android.app.Fragment
import android.app.FragmentManager
import android.os.Bundle
import android.support.annotation.IdRes
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasFragmentInjector
import javax.inject.Inject
import javax.inject.Named


/**
 * com.alexkeramidas.expendable.base
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
abstract class BaseActivity : Activity(), HasFragmentInjector {
    @Inject
    @field:Named(BaseActivityModule.Companion.ACTIVITY_FRAGMENT_MANAGER)
    lateinit var baseFragmentManager: FragmentManager

    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun fragmentInjector(): AndroidInjector<Fragment> {
        return fragmentInjector
    }

    protected fun addFragment(@IdRes containerViewId: Int, fragment: Fragment) {
        baseFragmentManager.beginTransaction()
                .add(containerViewId, fragment)
                .commit()
    }
}