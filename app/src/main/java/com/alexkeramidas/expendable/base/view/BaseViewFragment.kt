package com.alexkeramidas.expendable.base.view

import android.os.Bundle
import android.support.annotation.CallSuper
import com.alexkeramidas.expendable.base.presenter.Presenter
import javax.inject.Inject


/**
 * com.alexkeramidas.expendable.base.view
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
abstract class BaseViewFragment<T : Presenter> : BaseFragment(), BaseView {

    @Inject
    lateinit var presenter: T

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        // Only start the presenter when the views have been bound.
        // See BaseFragment.onViewStateRestored
        presenter.onStart(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun onPause() {
        super.onPause()
        presenter.onPause()
    }

    @CallSuper
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        presenter.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        presenter.onEnd()
        super.onDestroyView()
    }
}