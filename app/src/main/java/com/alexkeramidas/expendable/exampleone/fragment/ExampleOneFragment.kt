package com.alexkeramidas.expendable.exampleone.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.BindView
import butterknife.OnClick
import com.alexkeramidas.expendable.R
import com.alexkeramidas.expendable.base.BaseFragment
import com.alexkeramidas.expendable.utils.PerActivityUtil
import com.alexkeramidas.expendable.utils.PerFragmentUtil
import com.alexkeramidas.expendable.utils.SingletonUtil
import javax.inject.Inject


/**
 * com.alexkeramidas.expendable.exampleone.fragment
 * Expendable
 * Created by Alexandros Keramidas on 11/10/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
class ExampleOneFragment : BaseFragment() {

    @Inject
    lateinit var singletonUtil: SingletonUtil

    @Inject
    lateinit var perActivityUtil: PerActivityUtil

    @Inject
    lateinit var perFragmentUtil: PerFragmentUtil

    @BindView(R.id.some_text)
    lateinit var someText: TextView

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.example_1_fragment, container, false)
    }

    @OnClick(R.id.do_something)
    fun onDoSomethingClicked() {
        var something = singletonUtil.doSomething()
        something += "\n" + perActivityUtil.doSomething()
        something += "\n" + perFragmentUtil.doSomething()
        showSomething(something)
    }

    private fun showSomething(something: String) {
        someText!!.text = something
    }
}