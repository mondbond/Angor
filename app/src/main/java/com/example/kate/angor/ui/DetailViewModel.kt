package com.example.kate.angor.ui

import android.content.Context
import android.databinding.ObservableField
import android.databinding.ObservableInt
import android.view.View
import com.example.kate.angor.common.ViewModel

/**
 * Created by kate on 24.11.17.
 */

class DetailViewModel(val context: Context, val dataListener: DataListener): ViewModel {

    var infoMessageVisibility: ObservableInt

    var infoMessage: ObservableField<String>

    init {
        infoMessageVisibility = ObservableInt(View.VISIBLE)
        infoMessage = ObservableField<String>("infosmt")
    }

    var data: String = "data"


    override fun unbind() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bind() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    interface DataListener {
        fun onRepositoriesChanged()
    }
}
