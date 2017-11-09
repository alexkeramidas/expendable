package com.alexkeramidas.expendable.main.activity

import android.content.Intent
import android.os.Bundle
import com.alexkeramidas.expendable.R
import com.alexkeramidas.expendable.base.BaseActivity
import com.alexkeramidas.expendable.exampleone.activity.ExampleOneActivity
import com.alexkeramidas.expendable.examplethree.activity.ExampleThreeActivity
import com.alexkeramidas.expendable.exampletwo.activity.ExampleTwoActivity
import com.alexkeramidas.expendable.main.fragments.MainFragment
import com.alexkeramidas.expendable.main.fragments.MainFragmentListener


/**
 * com.alexkeramidas.expendable.main.activity
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
class MainActivity : BaseActivity(), MainFragmentListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            addFragment(R.id.fragment_container, MainFragment())
        }
    }

    override fun onExample1Clicked() {
        val intent = Intent(this, ExampleOneActivity::class.java)
        startActivity(intent)
    }

    override fun onExample2Clicked() {
        val intent = Intent(this, ExampleTwoActivity::class.java)
        startActivity(intent)
    }

    override fun onExample3Clicked() {
        val intent = Intent(this, ExampleThreeActivity::class.java)
        startActivity(intent)
    }
}