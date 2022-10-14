package com.example.solid_21.solid_5

import android.util.Log

class MySQL :ISQL{

    override fun save(form:IForm){
        Log.i("TAG", "form entry in the database")
    }
}