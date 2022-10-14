package com.example.solid_21.solid_1

import android.util.Log
import com.example.solid_21.solid.Computer


// 1-ый принцип SOLID(Single Responsibility Principle - принцип единственной ответственности )
// То есть в одном классе создаем методы, а в другом конструктор с параметрами
// То есть создаем классы, которые выполняют только свой функционал
class SaveComputer {

    fun saveToFile(path:String, computer:Computer){
        Log.i("TAG", "Save to a file $path $computer")
    }

    fun saveToBD(path: String, computer: Computer){
        Log.i("TAG","Save to a DATABASE $path $computer")
    }
}