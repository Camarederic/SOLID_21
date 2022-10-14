package com.example.solid_21.solid_5

import kotlin.properties.Delegates


// 5-ый принцип SOLID - Dependency Inversion Principle(принцип инверсии зависимостей)
// Он гласит, что классы должны зависеть от интерфейсов или абстрактных классов,
// а не от конкретных классов и функций
class ModelForm(id:Int, old:Int, fio:String): IForm {

    var id by Delegates.notNull<Int>()
    var old by Delegates.notNull<Int>()
    lateinit var fio:String
}