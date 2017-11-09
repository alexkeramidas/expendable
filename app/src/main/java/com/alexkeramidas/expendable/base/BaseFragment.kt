package com.alexkeramidas.expendable.base

import android.app.Activity
import android.app.Fragment
import android.app.FragmentManager
import android.content.Context
import android.os.Build
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
abstract class BaseFragment : Fragment(), HasFragmentInjector {
    @Inject
    lateinit var activityContext: Context

    @Inject
    @field:Named(BaseFragmentModule.Companion.CHILD_FRAGMENT_MANAGER)
    lateinit var baseChildFragmentManager: FragmentManager

    @Inject
    lateinit var childFragmentInjector: DispatchingAndroidInjector<Fragment>

    @SuppressWarnings
    override fun onAttach(activity: Activity) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            // Perform injection here before M, L (API 22) and below because onAttach(Context)
            // is not yet available at L.
            AndroidInjection.inject(this)
        }
        super.onAttach(activity)
    }

    override fun onAttach(context: Context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // Perform injection here for M (API 23) due to deprecation of onAttach(Activity).
            AndroidInjection.inject(this)
        }
        super.onAttach(context)
    }

    override fun fragmentInjector(): AndroidInjector<Fragment> {
        return childFragmentInjector
    }

    protected fun addChildFragment(@IdRes containerViewId: Int, fragment: Fragment) {
        baseChildFragmentManager.beginTransaction()
                .add(containerViewId, fragment)
                .commit()
    }
}

