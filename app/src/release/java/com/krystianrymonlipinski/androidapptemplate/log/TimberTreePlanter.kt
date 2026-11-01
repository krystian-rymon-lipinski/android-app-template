package com.krystianrymonlipinski.androidapptemplate.log

import android.util.Log
import timber.log.Timber

object TimberTreePlanter {
    fun plantTimberTree() {
        Timber.plant(ReleaseTree())
    }
}

class ReleaseTree : Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        when (priority) {
            Log.ERROR -> { } // TODO [SETUP]: add analytics tool
            Log.WARN -> { } // TODO [SETUP]: add analytics tool for those as well maybe?
            else -> Unit
        }
    }
}
