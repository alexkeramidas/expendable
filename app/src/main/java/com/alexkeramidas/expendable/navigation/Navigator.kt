package com.alexkeramidas.expendable.navigation

import android.content.Context
import android.content.Intent
import com.alexkeramidas.expendable.exampleone.activity.ExampleOneActivity
import com.alexkeramidas.expendable.examplethree.activity.ExampleThreeActivity
import com.alexkeramidas.expendable.exampletwo.activity.ExampleTwoActivity
import javax.inject.Inject
import javax.inject.Singleton


/**
 * com.alexkeramidas.expendable.navigation
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
@Singleton
class Navigator @Inject constructor() {

    fun toExample1(context: Context) {
        val intent = Intent(context, ExampleOneActivity::class.java)
        context.startActivity(intent)
    }

    fun toExample2(context: Context) {
        val intent = Intent(context, ExampleTwoActivity::class.java)
        context.startActivity(intent)
    }

    fun toExample3(context: Context) {
        val intent = Intent(context, ExampleThreeActivity::class.java)
        context.startActivity(intent)
    }
}