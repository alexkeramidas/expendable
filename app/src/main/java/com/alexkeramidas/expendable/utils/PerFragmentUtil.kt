package com.alexkeramidas.expendable.utils

import android.app.Fragment
import com.alexkeramidas.expendable.base.BaseFragmentModule
import com.alexkeramidas.expendable.scoping.PerFragment
import javax.inject.Inject
import javax.inject.Named

/**
 * com.alexkeramidas.expendable.utils
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */

@PerFragment
class PerFragmentUtil @Inject
constructor(@param:Named(BaseFragmentModule.FRAGMENT) private val fragment: Fragment) {

    fun doSomething(): String {
        return "PerFragmentUtil: " + hashCode() + ", Fragment: " + fragment.hashCode()
    }
}