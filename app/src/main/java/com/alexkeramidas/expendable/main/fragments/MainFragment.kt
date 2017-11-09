package com.alexkeramidas.expendable.main.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alexkeramidas.expendable.R
import com.alexkeramidas.expendable.base.BaseFragment
import javax.annotation.Nullable
import javax.inject.Inject

/**
 * com.alexkeramidas.expendable.main
 * Expendable
 * Created by Alexandros Keramidas on 11/9/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
class MainFragment : BaseFragment(), View.OnClickListener {

    @Inject
    lateinit var listener: MainFragmentListener

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO (Butterknife) replace with butterknife view binding
        view.findViewById<View>(R.id.example_1).setOnClickListener(this)
        view.findViewById<View>(R.id.example_2).setOnClickListener(this)
        view.findViewById<View>(R.id.example_3).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.example_1 -> onExample1Clicked()
            R.id.example_2 -> onExample2Clicked()
            R.id.example_3 -> onExample3Clicked()
            else -> throw IllegalArgumentException("Unhandled view " + v!!.id)
        }
    }

    private fun onExample1Clicked() {
        listener.onExample1Clicked()
    }

    private fun onExample2Clicked() {
        listener.onExample2Clicked()
    }

    private fun onExample3Clicked() {
        listener.onExample3Clicked()
    }
}