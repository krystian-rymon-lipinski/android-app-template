package com.krystianrymonlipinski.androidapptemplate

import android.app.Application
import com.krystianrymonlipinski.androidapptemplate.log.TimberTreePlanter
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AndroidTemplateApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        TimberTreePlanter.plantTimberTree()
    }
}
