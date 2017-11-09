package com.alexkeramidas.expendable.application

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


/**
 * com.alexkeramidas.expendable.application
 * Expendable
 * Created by Alexandros Keramidas on 11/8/2017.
 * Copyright (c) 2017 Alex Keramidas. All rights reserved.
 */
class ExpendableApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var expendableAppDependency: ExpendableApplicationDependency

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.create().inject(this)

    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector
    }
}
