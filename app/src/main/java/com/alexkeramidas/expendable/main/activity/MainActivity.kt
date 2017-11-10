package com.alexkeramidas.expendable.main.activity

import android.os.Bundle
import com.alexkeramidas.expendable.R
import com.alexkeramidas.expendable.base.BaseActivity
import com.alexkeramidas.expendable.main.fragments.MainFragment
import com.alexkeramidas.expendable.main.fragments.MainFragmentListener
import com.alexkeramidas.expendable.navigation.Navigator
import javax.inject.Inject


/**
 * com.alexkeramidas.expendable.main.activity
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
class MainActivity : BaseActivity(), MainFragmentListener {

    @Inject
    lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, MainFragment())
        }
    }

    override fun onExample1Clicked() {
        navigator.toExample1(this)
    }

    override fun onExample2Clicked() {
        navigator.toExample2(this)
    }

    override fun onExample3Clicked() {
        navigator.toExample3(this)
    }
}