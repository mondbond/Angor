package com.example.kate.angor.di

import android.content.Context
import com.example.kate.angor.App
import com.example.kate.angor.model.Repository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by kate on 24.11.17.
 */

@Module
class ApplicationModule (val app: App) {

    @Provides @Singleton
    fun providesContext(): Context = app.baseContext

    @Provides
    fun providesRepository(): Repository = Repository()
}