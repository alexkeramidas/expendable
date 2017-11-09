package com.alexkeramidas.expendable.util

import android.app.Fragment
import com.alexkeramidas.expendable.application.PerChildFragment
import com.alexkeramidas.expendable.base.BaseChildFragmentModule
import javax.inject.Inject
import javax.inject.Named


/**
 * com.alexkeramidas.expendable.util
 * Expendable
 * Created by Alexandros Keramidas on 09/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
@PerChildFragment
class PerChildFragmentUtil @Inject
internal constructor(@Named(BaseChildFragmentModule.CHILD_FRAGMENT) private val childFragment: Fragment) {

    fun doSomething(): String {
        return ("PerChildFragmentUtil: " + hashCode()
                + ", child Fragment: " + childFragment.hashCode())
    }
}