package com.app.telehealthdoctor.ui.dialogs

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.app.telehealthdoctor.R
import kotlinx.android.synthetic.main.cancel_req_dialog.*

class CancelReqDialog(context: Context, var text: String) : Dialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        if (text == "accept")
            setContentView(R.layout.accept_req_dialog)
        else
            setContentView(R.layout.cancel_req_dialog)
        window?.setBackgroundDrawableResource(android.R.color.transparent)
        window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )

        tv_no.setOnClickListener { dismiss() }
    }
}