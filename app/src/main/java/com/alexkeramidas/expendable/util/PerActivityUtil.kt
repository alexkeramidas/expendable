package com.alexkeramidas.expendable.util

import android.app.Activity
import com.alexkeramidas.expendable.application.PerActivity
import javax.inject.Inject



/**
 * com.alexkeramidas.expendable.util
 * Expendable
 * Created by Alexandros Keramidas on 09/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
@PerActivity
class PerActivityUtil @Inject
internal constructor(private val activity: Activity) {

    fun doSomething(): String {
        return "PerActivityUtil: " + hashCode() + ", Activity: " + activity.hashCode()
    }
}