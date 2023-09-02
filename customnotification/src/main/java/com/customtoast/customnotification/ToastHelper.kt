package com.customtoast.customnotification

import android.content.Context
import android.widget.Toast

object ToastHelper {

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}