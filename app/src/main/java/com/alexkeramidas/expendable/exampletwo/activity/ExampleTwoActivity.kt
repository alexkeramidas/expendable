package com.alexkeramidas.expendable.exampletwo.activity

import android.os.Bundle
import com.alexkeramidas.expendable.R
import com.alexkeramidas.expendable.base.BaseActivity
import com.alexkeramidas.expendable.exampletwo.fragments.fragmentalpha.ExampleTwoFragmentAlpha
import com.alexkeramidas.expendable.exampletwo.fragments.fragmentbeta.ExampleTwoFragmentBeta

/**
 * com.alexkeramidas.expendable.exampletwo.activity
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
class ExampleTwoActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.example_2_activity)

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_a_container, ExampleTwoFragmentAlpha())
            addFragment(R.id.fragment_b_container, ExampleTwoFragmentBeta())
        }
    }
}