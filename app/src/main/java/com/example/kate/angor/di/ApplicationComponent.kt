package com.example.kate.angor.di

import com.example.kate.angor.App
import dagger.Component

/**
 * Created by kate on 24.11.17.
 */

@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun injectTo(app: App)
}