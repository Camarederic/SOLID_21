package com.example.solid_21.solid_5

class WebFramework {

    fun save(form:IForm){
        val db:ISQL = MySQL()
        db.save(form)
    }
}