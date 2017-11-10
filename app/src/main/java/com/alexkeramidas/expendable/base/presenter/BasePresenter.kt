package com.alexkeramidas.expendable.base.presenter

import android.os.Bundle
import com.alexkeramidas.expendable.base.view.BaseView


/**
 * com.alexkeramidas.expendable.base.presenter
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */

abstract class BasePresenter<T : BaseView> protected constructor(protected var view: T) : Presenter {

    override fun onStart(savedInstanceState: Bundle?) {}

    override fun onResume() {}

    override fun onPause() {}

    override fun onSaveInstanceState(outState: Bundle) {}

    override fun onEnd() {}
}