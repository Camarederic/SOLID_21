package com.example.solid_21.solid

import android.util.Log
import kotlin.properties.Delegates

// 1-ый принцип SOLID(Single Responsibility Principle - принцип единственной ответственности )
// То есть в одном классе создаем методы, а в другом конструктор с параметрами
// То есть создаем классы, которые выполняют только свой функционал
class Computer(name: String, memorySize: Int) {

    lateinit var name:String
    var memorySize:Int = 0


}