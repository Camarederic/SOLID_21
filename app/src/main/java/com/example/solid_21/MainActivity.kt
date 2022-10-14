package com.example.solid_21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.solid_21.solid.Computer
import com.example.solid_21.solid_1.SaveComputer
import com.example.solid_21.solid_2.Computer2
import com.example.solid_21.solid_2.SaveComputerToDB
import com.example.solid_21.solid_2.SaveComputerToFile
import com.example.solid_21.solid_2.SaveInterface
import com.example.solid_21.solid_3.Computer3
import com.example.solid_21.solid_5.ModelForm
import com.example.solid_21.solid_5.WebFramework

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1-ый принцип SOLID
        val computer = Computer("IBM", 8000)

        val saveComputer = SaveComputer()
        saveComputer.saveToFile("out.dat", computer)
        saveComputer.saveToBD("dataBase", computer)

        // 2-ой принцип SOLID
        val computer2 = Computer2("Android", 2000)

        // Используем интерфейс, который ссылается на класс, то есть полиморфизм
        val saveComputerToFile: SaveInterface = SaveComputerToFile()
        saveComputerToFile.save("out.dat", computer2)
        // Используем интерфейс, который ссылается на класс, то есть полиморфизм
        val saveComputerToDB: SaveInterface = SaveComputerToDB()
        saveComputerToDB.save("database", computer2)

        test()

        // 4-ый принцип SOLID
        val modelForm = ModelForm(1,30,"Ibragimov")
        val webFramework = WebFramework()
        webFramework.save(modelForm)
    }

    // 3-ий принцип SOLID
    private fun test(){
        val computer = Computer("IBM XT", 5000)
        val computer3 = Computer3("OmenHP", 5000)

        computer3.saveData("IBM XT")
        if (computer.name.compareTo(computer3.name) == 0 && computer.memorySize == computer3.memorySize){
            Log.i("TAG", "Test OK")
        }else{
            Log.i("TAG", "Test fail")
        }
    }

}