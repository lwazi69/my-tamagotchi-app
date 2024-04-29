package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

private fun Button.setOnClickListner(function: (View) -> Unit) {

}

class Second_Page : AppCompatActivity() {

    private var petHealth = 100
    private var petHunger = 50
    private var petCleanliness = 70

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        //Get the buttons and text views
        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnclean = findViewById<Button>(R.id.btnClean)
        val btnHappy = findViewById<Button>(R.id.btnHappy)
        val txthunger = findViewById<EditText>(R.id.txt_hungry_value)
        val txtclean = findViewById<EditText>(R.id.txt_clean_value)
        val txthappy = findViewById<EditText>(R.id.txt_happy_value)

        //set the initial text values
        txthunger.setText(petHunger.toString())
        txtclean.setText(petCleanliness.toString())
        txthappy.setText(petHealth.toString())

        //handle button clicks
        btnFeed.setOnClickListener {
            it View !
            petHunger -= 10
            petHealth += 10
            petHunger += 5
            txthappy.setText(petHealth.toString())

        }
        btnHappy.setOnClickListner {
            it:View!
            petHealth += 10
            petHunger += 5
            petCleanliness -= 5
            txthappy.setText(petHealth.toString())
        }
        btnclean.setOnClickListner {
            it:View!
            petCleanliness += 10
            petHealth += 5

            txtclean.setText(petCleanliness.toString())
        }
    }



}