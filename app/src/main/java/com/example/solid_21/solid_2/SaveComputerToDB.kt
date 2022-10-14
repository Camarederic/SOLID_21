package com.example.solid_21.solid_2

import android.util.Log

class SaveComputerToDB : SaveInterface {

    override fun save(path: String, cmp: Computer2) {
        Log.i("TAG", "Save to a DATABASE $path, $cmp")
    }

}