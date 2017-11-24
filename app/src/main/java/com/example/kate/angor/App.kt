package com.example.kate.angor

import android.app.Application
import android.util.Log
import com.example.kate.angor.di.ApplicationComponent
import com.example.kate.angor.di.ApplicationModule
import com.example.kate.angor.di.DaggerApplicationComponent
import timber.log.Timber
import timber.log.Timber.DebugTree

/**
 * Created by kate on 24.11.17.
 */
class App : Application() {

    companion object {
        lateinit var graph: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()

        initDependencyGraph()

        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
        }
    }

    private fun initDependencyGraph() {
        graph = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
        graph.injectTo(this)
    }
}
