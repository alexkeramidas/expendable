package com.alexkeramidas.expendable.main


import kotlin.annotation.AnnotationRetention
import javax.inject.Qualifier
import javax.inject.Scope

/**
 * com.alexkeramidas.expendable.main
 * Expendable
 * Created by Alexandros Keramidas on 11/8/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
@Scope
annotation class MainScope