package com.alexkeramidas.expendable.exampleone.activity

import android.os.Bundle
import com.alexkeramidas.expendable.R
import com.alexkeramidas.expendable.base.BaseActivity
import com.alexkeramidas.expendable.exampleone.fragment.ExampleOneFragment

/**
 * com.alexkeramidas.expendable.exampleone.activity
 * Expendable
 * Created by Alexandros Keramidas on 11/10/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
class ExampleOneActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.example_1_activity)

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, ExampleOneFragment())
        }
    }
}