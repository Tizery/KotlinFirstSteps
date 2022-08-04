package com.example.kotlinfirststeps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Show Toast
        Toast.makeText(this@MainActivity, "TOAST", Toast.LENGTH_LONG).show()

        //Comment1
        //Comment2
        //Comment3-prePR
        //Comment4-testing_git2
        //Comment5-prePR
        //Comment6


        //Commit1
        //Commit2
        //Commit3+PR


        //Commit4_afterPR
        
        


        val button: Button = findViewById(R.id.action_btn)
        button.setOnClickListener { Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show() }

        val person = PersonData("Иван", "Иванов")

        val textViewName: TextView = findViewById(R.id.person_name)
        textViewName.text = person.name

        val textViewSurname: TextView = findViewById(R.id.person_surname)
        textViewSurname.text = person.surname

        val textViewCopySurname: TextView = findViewById(R.id.person_copy_surname)
        textViewCopySurname.text = NewSurname.newSurnameCopy.surname

        fun cycles() {
            for (i in 1..10) {
                println(i)
            }

            for (i in 50 downTo 0 step 10) {
                println(i)
            }

            var count: Int = 0
            while (count < 10) {
                count += 2
                println(count)
            }

            for (i in 1..10) {
                println("!!! Hello !!!")
            }
        }

        cycles()


    }

}
