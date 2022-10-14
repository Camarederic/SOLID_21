package com.example.solid_21.solid_3


// 3-ий принцип SOLID - Liskov Substitution Principle(принцип подстановки Барбары Лисков)
// То есть подклассы должны заменять свои базовые классы
// Это означает, что если у нас есть какой-либо дочерний класс, то он должен полностью
// повторять функционал своего базового класса
open class Computer3(name: String, memorySize: Int) {

     lateinit var name:String
    var memorySize:Int = 0

    open fun saveData(name:String){
        this.name = name
    }
}