package com.alexkeramidas.expendable.examplethree.fragment.childfragment

import com.alexkeramidas.expendable.base.presenter.BasePresenter
import com.alexkeramidas.expendable.scoping.PerChildFragment
import com.alexkeramidas.expendable.utils.PerActivityUtil
import com.alexkeramidas.expendable.utils.PerChildFragmentUtil
import com.alexkeramidas.expendable.utils.PerFragmentUtil
import com.alexkeramidas.expendable.utils.SingletonUtil
import javax.inject.Inject

@PerChildFragment
class ExampleThreeChildFragmentPresenterImpl
@Inject constructor(
        view: ExampleThreeChildFragmentView,
        private val singletonUtil: SingletonUtil,
        private val perActivityUtil: PerActivityUtil,
        private val perFragmentUtil: PerFragmentUtil,
        private val perChildFragmentUtil: PerChildFragmentUtil) :
        BasePresenter<ExampleThreeChildFragmentView>(view),
        ExampleThreeChildFragmentPresenter {
    override fun onDoSomething() {
        var something = singletonUtil.doSomething()
        something += "\n" + perActivityUtil.doSomething()
        something += "\n" + perFragmentUtil.doSomething()
        something += "\n" + perChildFragmentUtil.doSomething()
        view.showSomething(something)
    }
}