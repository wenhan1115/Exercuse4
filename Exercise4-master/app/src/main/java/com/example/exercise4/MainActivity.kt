package com.example.exercise4

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDate
import java.time.Year
import java.time.YearMonth
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // val Calendar
        val c = Calendar.getInstance()
        val day = c.get(Calendar.DAY_OF_MONTH)
        val month = c.get(Calendar.MONTH)
        var year = c.get(Calendar.YEAR)
    }



    fun calculate(year : Int)
    {
        val yearNow = Year.now().value
        val age = yearNow - year
        var saving = 0

        if(age >= 16 && age <= 20)
        {
            saving = 5000
        }
        else if(age >= 21 && age <= 25)
        {
            saving = 14000
        }
        else if(age >= 26 && age <= 30)
        {
            saving = 29000
        }
        else if(age >= 31 && age <= 35)
        {
            saving = 50000
        }
        else if(age >= 36 && age <= 40)
        {
            saving = 78000
        }
        else if(age >= 41 && age <= 45)
        {
            saving = 116000
        }
        else if(age >= 46 && age <= 50)
        {
            saving = 165000
        }
        else if(age >= 51 && age <= 55)
        {
            saving = 228000
        }
        else
        {
            saving = 0
        }

        val transfer = saving * 0.30

        txtAge.text = "Your Age: " + age
        txtSaving.text = "Minimum Saving: RM" + saving
        txtTransfer.text = "Maximum Transfer: RM" + "%.2f".format(transfer).toDouble()

    }

}
