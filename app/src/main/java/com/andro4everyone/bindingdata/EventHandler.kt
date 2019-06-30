package com.andro4everyone.bindingdata

import android.content.Context
import android.widget.Toast

open class EventHandler(context: Context) {
    val myContext: Context = context

    fun btnClicked() {
        Toast.makeText(myContext, "Horraayy, I am Clicked!", Toast.LENGTH_LONG).show()
    }
}