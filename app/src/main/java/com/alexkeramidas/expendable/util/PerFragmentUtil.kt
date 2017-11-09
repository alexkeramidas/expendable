package com.alexkeramidas.expendable.util

import android.app.Fragment
import com.alexkeramidas.expendable.application.PerFragment
import com.alexkeramidas.expendable.base.BaseFragmentModule
import javax.inject.Inject
import javax.inject.Named


/**
 * com.alexkeramidas.expendable.util
 * Expendable
 * Created by Alexandros Keramidas on 09/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
@PerFragment
class PerFragmentUtil @Inject
internal constructor(@Named(BaseFragmentModule.FRAGMENT) private val fragment: Fragment) {

    fun doSomething(): String {
        return "PerFragmentUtil: " + hashCode() + ", Fragment: " + fragment.hashCode()
    }
}