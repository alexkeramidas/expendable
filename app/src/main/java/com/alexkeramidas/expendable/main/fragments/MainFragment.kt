package com.alexkeramidas.expendable.main.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.OnClick
import com.alexkeramidas.expendable.R
import com.alexkeramidas.expendable.base.view.BaseFragment
import javax.inject.Inject

/**
 * com.alexkeramidas.expendable.main
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
class MainFragment : BaseFragment() {

    @Inject
    lateinit var listener: MainFragmentListener

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.main_fragment, container, false)
    }

    @OnClick(R.id.example_1)
    fun onExample1Clicked() {
        listener.onExample1Clicked()
    }

    @OnClick(R.id.example_2)
    fun onExample2Clicked() {
        listener.onExample2Clicked()
    }

    @OnClick(R.id.example_3)
    fun onExample3Clicked() {
        listener.onExample3Clicked()
    }
}