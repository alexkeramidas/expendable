package com.alexkeramidas.expendable.examplethree.fragment

import com.alexkeramidas.expendable.base.presenter.BasePresenter
import com.alexkeramidas.expendable.scoping.PerFragment
import com.alexkeramidas.expendable.utils.PerActivityUtil
import com.alexkeramidas.expendable.utils.PerFragmentUtil
import com.alexkeramidas.expendable.utils.SingletonUtil
import javax.inject.Inject

@PerFragment
class ExampleThreeParentFragmentPresenterImpl
@Inject constructor(
        view: ExampleThreeParentFragmentView,
        private val singletonUtil: SingletonUtil,
        private val perActivityUtil: PerActivityUtil,
        private val perFragmentUtil: PerFragmentUtil) :
        BasePresenter<ExampleThreeParentFragmentView>(view),
        ExampleThreeParentFragmentPresenter {
    override fun doSomething() {
        var something = singletonUtil.doSomething()
        something += "\n" + perActivityUtil.doSomething()
        something += "\n" + perFragmentUtil.doSomething()
        view.showSomething(something)
    }
}