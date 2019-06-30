package com.andro4everyone.bindingdata

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class Contact (_name: String, _email: String): BaseObservable() { //extends BaseObservables for observing data changes
    //getter and setter code for our contact
    @get: Bindable
    var name: String = _name
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    @get: Bindable
    var email: String = _email
        set(value) {
            field = value
            notifyPropertyChanged(BR.email)
        }

}