package com.alexkeramidas.expendable.examplethree.activity

import android.os.Bundle
import com.alexkeramidas.expendable.R
import com.alexkeramidas.expendable.base.BaseActivity
import com.alexkeramidas.expendable.examplethree.fragment.ExampleThreeParentFragment

/**
 * com.alexkeramidas.expendable.examplethree.activity
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
class ExampleThreeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.example_3_activity)

        if (savedInstanceState == null) {
            addFragment(R.id.parent_fragment_container, ExampleThreeParentFragment())
        }
    }
}