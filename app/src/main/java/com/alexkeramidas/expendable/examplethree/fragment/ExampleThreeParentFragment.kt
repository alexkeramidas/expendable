package com.alexkeramidas.expendable.examplethree.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.alexkeramidas.expendable.R
import com.alexkeramidas.expendable.base.BaseFragment
import com.alexkeramidas.expendable.examplethree.fragment.childfragment.ExampleThreeChildFragment
import com.alexkeramidas.expendable.utils.PerActivityUtil
import com.alexkeramidas.expendable.utils.PerFragmentUtil
import com.alexkeramidas.expendable.utils.SingletonUtil
import javax.annotation.Nullable
import javax.inject.Inject


/**
 * com.alexkeramidas.expendable.examplethree.activity
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
class ExampleThreeParentFragment : BaseFragment(), View.OnClickListener {
    @Inject
    lateinit var singletonUtil: SingletonUtil

    @Inject
    lateinit var perActivityUtil: PerActivityUtil

    @Inject
    lateinit var perFragmentUtil: PerFragmentUtil

    private var someText: TextView? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.example_3_parent_fragment, container, false)
    }

    override fun onViewCreated(view: View?, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addChildFragment(R.id.child_fragment_container, ExampleThreeChildFragment())


        someText = view!!.findViewById<View>(R.id.some_text) as TextView
        view.findViewById<View>(R.id.do_something).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.do_something -> onDoSomethingClicked()
            else -> throw IllegalArgumentException("Unhandled view " + v.id)
        }
    }

    private fun onDoSomethingClicked() {
        var something = singletonUtil.doSomething()
        something += "\n" + perActivityUtil.doSomething()
        something += "\n" + perFragmentUtil.doSomething()
        showSomething(something)
    }

    private fun showSomething(something: String) {
        someText!!.text = something
    }
}