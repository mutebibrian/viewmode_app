package com.kotlinseries.viewmodeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.kotlinseries.viewmodeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // I will start creating an instance of Late initialization of our main activity.
    //View model.I will name it as view model. Main Activity View Model.
    lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //I'm creating an instance of this class. This main activity view model, and I will instantiate it here.
        //------------------------------------------------------------------------------------------
        //We can not construct a ViewModel instance on our own. We need to use the ViewModelProvider
        // utility provided by Android to create instances of ViewModels.
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        //I need to use the view model provider here in order to set view model for this class.

        //-----------------------------------------------------------------------
        //So I need to call the view model object.Get current count dot to string.
        binding.countText.text = viewModel.getCurrentCount().toString()
        binding.button.setOnClickListener {
            binding.countText.text = viewModel.getUpdatedCount().toString()

        }


    }
}