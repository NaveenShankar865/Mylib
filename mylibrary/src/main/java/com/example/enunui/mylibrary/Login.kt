package com.example.enunui.mylibrary

import android.content.Context
import android.widget.Toast

object Login {
    fun Log(ctx: Context,msg: String ){
        Toast.makeText(ctx,msg,Toast .LENGTH_LONG).show()
    }
}
