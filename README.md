# Assignment_2_IMAD51111
Overview 

This is a simple Android quiz application built with Kotlin that tests users' knowledge on historical facts. The app presents a series of true/false questions and tracks the user's score. 

Features 

Multiple true/false questions about historical events 

Score tracking 

Feedback for correct/incorrect answers 

Review all questions and answers at the end 

Option to retry the quiz or exit 

Code Structure 

Main Components 

MainActivity.kt - Entry point with start button 

kotlin 

Copy 

Download 

buttonStart?.setOnClickListener { 
    val intent = Intent(this, questions::class.java) 
    startActivity(intent) 
} 

QuestionsActivity.kt - Handles the quiz questions 

Displays questions one at a time 

Checks answers 

Tracks score 

Navigates to score screen when quiz completes 

ScoreActivity.kt - Shows final results 

Displays score 

Provides performance feedback 

Offers review option 

Provides retry and exit buttons 

Question Data 

The app uses two lists to manage questions and answers: 

kotlin 

Copy 

Download 

val questionsList = listOf( 
    "The USA won the cold war", 
    "Vincent van Gogh painted the Mona Lisa", 
    // ... more questions 
) 
 
val answerList = listOf( 
    true,  // For question 1 
    false, // For question 2 
    // ... more answers 
) 

How It Works 

User clicks "Start" button 

First question appears with True/False buttons 

User selects answer and gets immediate feedback 

Click "Next" button to proceed to next question 

After last question, score screen appears showing: 

Total correct answers 

Performance message 

Option to review all questions 

Option to retry or exit 

Button Functions 

True/False Buttons: Submit answers 

Next Button: Proceeds to next question 

Review Button: Shows all questions with correct answers 

Retry Button: Restarts the quiz 

Exit Button: Closes the app 

Requirements 

Android Studio 

Minimum SDK level: 21 (Android 5.0 Lollipop) 

Known Issues 

No shuffle functionality for questions 

Fixed number of questions (10) 

No persistence of high scores 

Future Improvements 

Add question categories 

Implement difficulty levels 
https://www.youtube.com/watch?v=m3CpY8ibiyU 

Add user accounts and leaderboards 

Include multimedia questions (images/audio) 
