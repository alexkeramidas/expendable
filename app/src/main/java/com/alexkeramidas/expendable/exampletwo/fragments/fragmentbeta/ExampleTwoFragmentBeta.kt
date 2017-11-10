package com.alexkeramidas.expendable.exampletwo.fragments.fragmentbeta

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
 * com.alexkeramidas.expendable.exampletwo.activity
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
class ExampleTwoFragmentBeta : BaseViewFragment<ExampleTwoFragmentBetaPresenter>(), ExampleTwoFragmentBetaView {

    @BindView(R.id.some_text)
    lateinit var someText: TextView

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.example_2_fragment_b, container, false)
    }

    @OnClick(R.id.do_something)
    fun onDoSomethingClicked() {
        presenter.onDoSomething()
    }

    override fun showSomething(something: String) {
        someText.text = something
    }
}