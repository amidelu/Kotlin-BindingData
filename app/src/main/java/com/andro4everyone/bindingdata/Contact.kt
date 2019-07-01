package com.andro4everyone.bindingdata

import android.widget.ImageView
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

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
    companion object {
        @JvmStatic @BindingAdapter ("profileImage")
        fun loadImage(view: ImageView, imageUrl: String) {
            Glide.with(view.context)
                .load(imageUrl)
                .into(view)
        }
    }
}