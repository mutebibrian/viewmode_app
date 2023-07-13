package com.kotlinseries.viewmodeapp

import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {
    private var counter = 0
    fun getCurrentCount(): Int {
        return counter
        //Here we just get the current state of the counter.
    }
    fun getUpdatedCount(): Int {
        return ++counter
        //Here we increase the counter

    }

}