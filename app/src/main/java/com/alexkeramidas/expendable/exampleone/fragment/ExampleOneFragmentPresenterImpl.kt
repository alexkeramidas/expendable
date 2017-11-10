package com.alexkeramidas.expendable.exampleone.fragment

import com.alexkeramidas.expendable.base.presenter.BasePresenter
import com.alexkeramidas.expendable.scoping.PerFragment
import com.alexkeramidas.expendable.utils.PerActivityUtil
import com.alexkeramidas.expendable.utils.PerFragmentUtil
import com.alexkeramidas.expendable.utils.SingletonUtil
import javax.inject.Inject


@PerFragment
class ExampleOneFragmentPresenterImpl
@Inject constructor(
        view: ExampleOneFragmentView,
        private val singletonUtil: SingletonUtil,
        private val perActivityUtil: PerActivityUtil,
        private val perFragmentUtil: PerFragmentUtil) :
        BasePresenter<ExampleOneFragmentView>(view),
        ExampleOneFragmentPresenter {

    override fun onDoSomething() {
        // Do something here. Maybe make an asynchronous call to fetch data...
        var something = singletonUtil.doSomething()
        something += "\n" + perActivityUtil.doSomething()
        something += "\n" + perFragmentUtil.doSomething()
        view.showSomething(something)
    }
}