package com.alexkeramidas.expendable.util

import javax.inject.Inject
import javax.inject.Singleton



/**
 * com.alexkeramidas.expendable.util
 * Expendable
 * Created by Alexandros Keramidas on 09/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
@Singleton
class SingletonUtil @Inject
internal constructor() {
    fun doSomething(): String {
        return "SingletonUtil: " + hashCode()
    }
}