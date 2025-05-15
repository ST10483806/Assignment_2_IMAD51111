package com.example.assignment2

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import kotlin.text.StringBuilder

class Score : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val scoreView = findViewById<TextView>(R.id.scoreView)
        val msgtextView = findViewById<TextView>(R.id.msgtextView)
        val reviewView = findViewById<TextView>(R.id.reviewView)
        val reviewButton = findViewById<Button>(R.id.reviewButton)
        val exitButton = findViewById<Button>(R.id.exitButton)
        val retryButton = findViewById<Button>(R.id.retryButton)
        val score = intent.getIntExtra("score", 0)
        val totalquestions = intent.getIntExtra("Total-Questions", 10)

        scoreView.text = " Your score is: ${score} out of ${totalquestions}"

        if ( score >= 7){
            msgtextView.text = "That was a great performance!!"
        } else{

            msgtextView.text = "You will get it next time."
        }

        val questionsList = listOf(
            "The USA won the cold war",
            "Vincent van Gogh painted the Mona Lisa",
            "The American Civil War was fought between the Union and the Confederacy",
            "Marie Curie was the first women to with a Nobel Prize",
            "The Soviet Union fell in 1981",
            "Adolf Hitler committed suicide",
            "Nelson Mandela was a South African anti-apartheid revolutionary",
            "The Industrial Revolution began in the 17th century",
            "World War 2 ended in 1950",
            "Nelson Mandela became president of the South African Republic in 1994"
        )

        val answerList = listOf(
            true, // The USA won the Cold War
            false, // Vincent van Gogh painted the Mona Lisa
            true, //The American Civil War was fought between the Union and the Confederacy
            true, // Marie Curie was the first women to with a Nobel Prize
            false, // The Soviet Union fell in 1981
            true, // Adolf Hitler committed suicide
            true, // Nelson Mandela was a South African anti-apartheid revolutionary
            false, // The Industrial War began in the 17th century
            false, // World War 2 ended in 1950
            true // Nelson Mandela became president of the South African Republic in 1994
        )

        reviewButton.setOnClickListener {

            val reviewtextview = StringBuilder()
            for (i in questionsList.indices){
                reviewtextview.append("Question ${i + 1}: ${questionsList[i]}\n")
                reviewtextview.append("Correct answer: ${if (answerList[i]) "True" else "False"}\n")
                reviewView.text = reviewtextview.toString()
            }


        }

        retryButton.setOnClickListener {
            val intent = Intent( this,MainActivity::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finishAffinity()
        }

    }
}