package com.alexkeramidas.expendable.exampleone.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.BindView
import butterknife.OnClick
import com.alexkeramidas.expendable.R
import com.alexkeramidas.expendable.base.view.BaseViewFragment


/**
 * com.alexkeramidas.expendable.exampleone.fragment
 * Expendable
 * Created by Alexandros Keramidas on 11/10/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
class ExampleOneFragment : BaseViewFragment<ExampleOneFragmentPresenter>(), ExampleOneFragmentView {

    @BindView(R.id.some_text)
    lateinit var someText: TextView

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.example_1_fragment, container, false)
    }

    @OnClick(R.id.do_something)
    fun onDoSomethingClicked() {
        presenter.onDoSomething()
    }

    override fun showSomething(something: String) {
        someText.text = something
    }
}