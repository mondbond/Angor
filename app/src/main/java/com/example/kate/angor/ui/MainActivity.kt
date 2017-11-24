package com.example.kate.angor.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.example.kate.angor.R
import com.example.kate.angor.common.BaseActivity
import com.example.kate.angor.databinding.ActivityMainBinding
import com.example.kate.angor.di.ApplicationComponent

class MainActivity : BaseActivity(), DetailViewModel.DataListener {
    override fun onRepositoriesChanged() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    lateinit var binding: ActivityMainBinding
    lateinit var detailViewModel:DetailViewModel

    override fun injectDependencies(graph: ApplicationComponent) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        detailViewModel = DetailViewModel(this, this)

        binding.viewModel = detailViewModel;

        setContentView(R.layout.activity_main)
    }
}
