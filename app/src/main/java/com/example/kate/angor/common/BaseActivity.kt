package com.example.kate.angor.common

import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.v7.app.AppCompatActivity
import com.example.kate.angor.App
import com.example.kate.angor.di.ApplicationComponent

/**
 * Created by kate on 24.11.17.
 */
abstract class BaseActivity: AppCompatActivity() {

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        injectDependencies(App.graph)
    }

    abstract fun injectDependencies(graph: ApplicationComponent)
}