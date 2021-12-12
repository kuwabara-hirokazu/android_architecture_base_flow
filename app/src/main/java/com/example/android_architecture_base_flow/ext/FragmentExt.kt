package com.example.android_architecture_base_flow.ext

import android.view.View
import androidx.fragment.app.Fragment
import com.example.android_architecture_base_flow.R
import com.example.android_architecture_base_flow.view.ui.Failure
import com.google.android.material.snackbar.Snackbar

fun Fragment.showError(view: View, failure: Failure) {
    Snackbar.make(view, failure.toMessage(), Snackbar.LENGTH_LONG)
        .setAction(R.string.retry) { failure.retry() }
        .show()
}
