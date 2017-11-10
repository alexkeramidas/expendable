package com.alexkeramidas.expendable.base.presenter

import android.os.Bundle
import javax.annotation.Nullable


/**
 * com.alexkeramidas.expendable.base.presenter
 * Expendable
 * Created by Alexandros Keramidas on 10/Νοε/2017.
 * Copyright (c) 2017 alex. All rights reserved
 */
interface Presenter {
    /**
     * Starts the presentation. This should be called in the view's (Activity or Fragment)
     * onCreate() or onViewStatedRestored() method respectively.
     *
     * @param savedInstanceState the saved instance state that contains state saved in
     * [.onSaveInstanceState]
     */
    fun onStart(@Nullable savedInstanceState: Bundle?)

    /**
     * Resumes the presentation. This should be called in the view's (Activity or Fragment)
     * onResume() method.
     */
    fun onResume()

    /**
     * Pauses the presentation. This should be called in the view's Activity or Fragment)
     * onPause() method.
     */
    fun onPause()

    /**
     * Save the state of the presentation (if any). This should be called in the view's
     * (Activity or Fragment) onSaveInstanceState().
     *
     * @param outState the out state to save instance state
     */
    fun onSaveInstanceState(outState: Bundle)

    /**
     * Ends the presentation. This should be called in the view's (Activity or Fragment)
     * onDestroy() or onDestroyView() method respectively.
     */
    fun onEnd()
}