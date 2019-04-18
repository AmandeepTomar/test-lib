package com.example.mttestlib

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun showSimple(v: View) {
        ToastMessage.showSimpleToast(v.context, "Simple toast message")
    }

    fun showSuccess(view: View) {
        ToastMessage.showSuccessToast(view.context, "Yepp!!! Result successfully presented")
    }

    fun showSuccessImage(view: View) {
        ToastMessage.showSuccessToast(view.context, "Yepp!!! Result successfully presented", R.drawable.ic_contacts_black_24dp)

    }

    fun showError(view: View) {
        ToastMessage.showErrorToast(view.context, "Opps!!! Error occurred")

    }

    fun showErrorImage(view: View) {
        ToastMessage.showErrorToast(view.context, "Opps!!! Error occurred", R.drawable.ic_contacts_black_24dp)

    }
}
