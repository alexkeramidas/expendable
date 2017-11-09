package com.alexkeramidas.expendable.utils

import javax.inject.Inject
import javax.inject.Singleton

/**
 * com.alexkeramidas.expendable.utils
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
@Singleton
class SingletonUtil @Inject
constructor() {

    fun doSomething(): String {
        return "SingletonUtil: " + hashCode()
    }
}