package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class questions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val questionsView = findViewById<TextView>(R.id.questionsView)
        val feedbackView = findViewById<TextView>(R.id.feedbackView)
        val falseButton = findViewById<Button>(R.id.falseButton)
        val trueButton = findViewById<Button>(R.id.trueButton)
        val questionsButton = findViewById<Button>(R.id.questionsButton)



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
            true,
            false,
            true,
            true,
            false,
            true,
            true,
            false,
            false,
            true
        )

        var currentquestionNum = 0
        var  scores = 0
        questionsView.text = questionsList[currentquestionNum]

        trueButton.setOnClickListener {
            if (answerList[currentquestionNum]== true){

                scores++
                feedbackView.text= "Congrats! You are correct!!"

            }
        }


        falseButton.setOnClickListener {
            if (answerList[currentquestionNum] == false){

                scores++
                feedbackView.text = "Congrats! You are correct!!"
            }else{
                feedbackView.text = "eish, sorry you are wrong!!"
            }
        }

        questionsButton.setOnClickListener {

            currentquestionNum++
            if(currentquestionNum < questionsList.size){
                questionsView.text = questionsList[currentquestionNum]
            }

            else{
                val intent = Intent(this,Score::class.java)
                intent.putExtra("score", scores)
                intent.putExtra("total", 10)
                startActivity(intent)

            }
        }


            


    }
}