package com.alexkeramidas.expendable.examplethree.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import butterknife.BindView
import butterknife.OnClick
import com.alexkeramidas.expendable.R
import com.alexkeramidas.expendable.base.view.BaseViewFragment
import com.alexkeramidas.expendable.examplethree.fragment.childfragment.ExampleThreeChildFragment
import javax.annotation.Nullable


/**
 * com.alexkeramidas.expendable.examplethree.activity
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
class ExampleThreeParentFragment : BaseViewFragment<ExampleThreeParentFragmentPresenter>(), ExampleThreeParentFragmentView {
    @BindView(R.id.some_text)
    lateinit var someText: TextView

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.example_3_parent_fragment, container, false)
    }

    override fun onViewCreated(view: View?, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addChildFragment(R.id.child_fragment_container, ExampleThreeChildFragment())
    }

    @OnClick(R.id.do_something)
    fun onDoSomethingClicked() {
        presenter.doSomething()
    }

    override fun showSomething(something: String) {
        someText.text = something
    }
}