package com.alexkeramidas.expendable.exampletwo.fragments.fragmentalpha

import com.alexkeramidas.expendable.base.presenter.BasePresenter
import com.alexkeramidas.expendable.scoping.PerFragment
import com.alexkeramidas.expendable.utils.PerActivityUtil
import com.alexkeramidas.expendable.utils.PerFragmentUtil
import com.alexkeramidas.expendable.utils.SingletonUtil
import javax.inject.Inject

@PerFragment
class ExampleTwoFragmentAlphaPresenterImpl
@Inject constructor(view: ExampleTwoFragmentAlphaView,
                    private val singletonUtil: SingletonUtil,
                    private val perActivityUtil: PerActivityUtil,
                    private val perFragmentUtil: PerFragmentUtil) :
        BasePresenter<ExampleTwoFragmentAlphaView>(view),
        ExampleTwoFragmentAlphaPresenter {
    override fun onDoSomething() {
        var something = singletonUtil.doSomething()
        something += "\n" + perActivityUtil.doSomething()
        something += "\n" + perFragmentUtil.doSomething()
        view.showSomething(something)
    }
}