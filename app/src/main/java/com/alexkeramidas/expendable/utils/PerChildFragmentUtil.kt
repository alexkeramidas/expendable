package com.alexkeramidas.expendable.utils

import android.app.Fragment
import com.alexkeramidas.expendable.base.BaseChildFragmentModule
import com.alexkeramidas.expendable.scoping.PerChildFragment
import javax.inject.Inject
import javax.inject.Named

/**
 * com.alexkeramidas.expendable.utils
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
@PerChildFragment
class PerChildFragmentUtil @Inject
constructor(@param:Named(BaseChildFragmentModule.CHILD_FRAGMENT) private val childFragment: Fragment) {

    fun doSomething(): String {
        return ("PerChildFragmentUtil: " + hashCode()
                + ", child Fragment: " + childFragment.hashCode())
    }
}