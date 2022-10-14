package com.example.solid_21.solid_3

class OmenHP: Computer3(name = "", memorySize = 0) {

    override fun saveData(name:String){
        this.name = name
        this.memorySize = 8000
    }
}