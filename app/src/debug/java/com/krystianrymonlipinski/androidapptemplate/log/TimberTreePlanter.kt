package com.krystianrymonlipinski.androidapptemplate.log

import timber.log.Timber

object TimberTreePlanter {
    fun plantTimberTree() {
        Timber.plant(Timber.DebugTree())
    }
}
