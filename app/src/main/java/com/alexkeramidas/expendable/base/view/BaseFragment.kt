package com.alexkeramidas.expendable.base.view

import android.app.Activity
import android.app.Fragment
import android.app.FragmentManager
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.support.annotation.IdRes
import butterknife.ButterKnife
import butterknife.Unbinder
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasFragmentInjector
import javax.annotation.Nullable
import javax.inject.Inject
import javax.inject.Named

/**
 * com.alexkeramidas.expendable.base.view
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
abstract class BaseFragment : Fragment(), HasFragmentInjector {
    @Inject
    lateinit var activityContext: Context

    @Inject
    @field:Named(BaseFragmentModule.Companion.CHILD_FRAGMENT_MANAGER)
    lateinit var baseChildFragmentManager: FragmentManager

    @Inject
    lateinit var childFragmentInjector: DispatchingAndroidInjector<Fragment>

    @Nullable
    lateinit var viewUnbinder: Unbinder

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        // No need to check if getView() is null because this lifecycle method will
        // not get called if the view returned in onCreateView, if any, is null.
        viewUnbinder = ButterKnife.bind(this, view)
    }

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

    override fun onDestroyView() {
        // This lifecycle method still gets called even if onCreateView returns a null view.
        if (viewUnbinder != null) {
            viewUnbinder.unbind()
        }
        super.onDestroyView()
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

