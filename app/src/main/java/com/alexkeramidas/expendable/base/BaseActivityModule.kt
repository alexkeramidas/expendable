package com.alexkeramidas.expendable.base

import android.app.Activity
import android.app.FragmentManager
import android.content.Context
import com.alexkeramidas.expendable.application.PerActivity
import dagger.Binds
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
abstract class BaseActivityModule {

    @Binds
    @PerActivity
    internal abstract fun activityContext(activity: Activity): Context

    companion object {

        const val ACTIVITY_FRAGMENT_MANAGER = "BaseActivityModule.activityFragmentManager"

        @Provides
        @Named(ACTIVITY_FRAGMENT_MANAGER)
        @PerActivity
        internal fun activityFragmentManager(activity: Activity): FragmentManager {
            return activity.fragmentManager
        }
    }
}