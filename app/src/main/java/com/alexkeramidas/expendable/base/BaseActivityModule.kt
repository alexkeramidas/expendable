package com.alexkeramidas.expendable.base

import android.app.Activity
import android.app.FragmentManager
import android.content.Context
import com.alexkeramidas.expendable.scoping.PerActivity
import dagger.Binds
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
abstract class BaseActivityModule {

    @Binds
    @PerActivity
    abstract fun activityContext(activity: Activity): Context

    @Module
    companion object {

        const val ACTIVITY_FRAGMENT_MANAGER = "BaseActivityModule.activityFragmentManager"

        @JvmStatic
        @Provides
        @Named(ACTIVITY_FRAGMENT_MANAGER)
        @PerActivity
        fun activityFragmentManager(activity: Activity): FragmentManager {
            return activity.fragmentManager
        }
    }
}