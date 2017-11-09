package com.alexkeramidas.expendable.utils

import android.app.Activity
import com.alexkeramidas.expendable.scoping.PerActivity
import javax.inject.Inject

/**
 * com.alexkeramidas.expendable.utils
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */

@PerActivity
class PerActivityUtil @Inject
constructor(private val activity: Activity) {

    fun doSomething(): String {
        return "PerActivityUtil: " + hashCode() + ", Activity: " + activity.hashCode()
    }
}