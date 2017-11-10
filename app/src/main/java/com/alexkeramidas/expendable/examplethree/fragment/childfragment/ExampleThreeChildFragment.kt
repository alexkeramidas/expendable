package com.alexkeramidas.expendable.examplethree.fragment.childfragment

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
 * com.alexkeramidas.expendable.examplethree.activity
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
class ExampleThreeChildFragment : BaseViewFragment<ExampleThreeChildFragmentPresenter>(), ExampleThreeChildFragmentView {
    @BindView(R.id.some_text)
    lateinit var someText: TextView

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.example_3_child_fragment, container, false)
    }

    @OnClick(R.id.do_something)
    fun onDoSomethingClicked() {
        presenter.onDoSomething()
    }

    override fun showSomething(something: String) {
        childFragmentManager.hashCode()
        someText.text = something
    }
}