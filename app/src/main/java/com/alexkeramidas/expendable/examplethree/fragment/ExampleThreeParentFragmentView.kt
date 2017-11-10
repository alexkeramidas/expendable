package com.alexkeramidas.expendable.examplethree.fragment

import com.alexkeramidas.expendable.base.view.BaseView

/**
 * com.alexkeramidas.expendable.examplethree.fragment.childfragment
 * Expendable
 * Created by Alexandros Keramidas on 11/10/2017.
 * Copyright (c) 2017 Authentiq. All rights reserved.
 */
interface ExampleThreeParentFragmentView : BaseView {
    fun showSomething(something: String)
}