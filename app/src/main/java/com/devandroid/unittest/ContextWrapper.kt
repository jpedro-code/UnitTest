package com.devandroid.unittest

import android.content.Context
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class ContextWrapper(private val context: Context) {

    fun getTitle():String{
        return context.getString(R.string.hello_world)
    }
}