package com.example.solid_21.solid_2

import kotlin.properties.Delegates


// 2-ой принцип SOLID(Open-Closed Principle - принцип открытости-закрытости)
// Этот принцип предполагает, что классы должны быть закрыты для модификации, но открыты для расширения
class Computer2(name:String, memorySize:Int) {

    lateinit var name:String
    var memorySize:Int = 0

}