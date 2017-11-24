package com.example.kate.angor.common

import android.databinding.ViewDataBinding
import com.example.kate.angor.di.ApplicationComponent

/**
 * Created by kate on 24.11.17.
 */
class ViewModelActivity<T : ViewModel, B : ViewDataBinding> :BaseActivity() {
    override fun injectDependencies(graph: ApplicationComponent) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}