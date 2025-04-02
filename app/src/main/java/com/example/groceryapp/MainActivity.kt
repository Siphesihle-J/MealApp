package com.example.groceryapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// Title: Declarations
// Author: Kotlin programming logic
// Version: 1.0
// Available: https://kotlinlang.org/spec/declarations.html

class MainActivity : AppCompatActivity() {
    // Declare UI components
    private lateinit var timeOfDayEditText: EditText
    private lateinit var suggestMealButton: Button
    private lateinit var resetButton: Button
    private lateinit var mealSuggestionTextView: TextView
    private lateinit var errorMessageTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI components by finding them in the layout
        timeOfDayEditText = findViewById(R.id.timeOfDayEditText)
        suggestMealButton = findViewById(R.id.suggestMealButton)
        resetButton = findViewById(R.id.resetButton)
        mealSuggestionTextView = findViewById(R.id.mealSuggestionTextView)
        errorMessageTextView = findViewById(R.id.errorMessageTextView)

        // Set up click listener for the Suggest Meal button
        suggestMealButton.setOnClickListener {
            suggestMeal()
        }

        // Set up click listener for the Reset button
        resetButton.setOnClickListener {
            resetInputAndSuggestion()
        }
    }

    /**
     * Suggests a meal based on the time of day entered by the user
     */
    private fun suggestMeal() {
        // Get the time of day from the EditText field
        val timeOfDay = timeOfDayEditText.text.toString().trim().lowercase()

        // Clear any previous error messages
        errorMessageTextView.text = ""

        // Title: Kotlin If ... Else
        // Author: w3schools
        // Version: 1.0
        // Available: https://www.w3schools.com/programming/prog_if.php

        // Validate the input and suggest a meal based on the time of day
        if (timeOfDay.isEmpty()) {
            // Display error for empty input
            errorMessageTextView.text = "Please enter a time of day"
            return
        }

        // Use if-else statements to determine the meal suggestion based on the time of day
        val mealSuggestion = if (timeOfDay == "morning") {
            "Breakfast: Scrambled eggs with avocado toast and fresh orange juice"
        } else if (timeOfDay == "mid-morning") {
            "Mid-morning Snack: Greek yogurt with honey and fresh berries"
        } else if (timeOfDay == "afternoon") {
            "Lunch: Grilled chicken salad with balsamic vinaigrette and a side of quinoa"
        } else if (timeOfDay == "mid-afternoon") {
            "Afternoon Snack: Carrot sticks with hummus and a small handful of almonds"
        } else if (timeOfDay == "dinner") {
            "Dinner: Baked salmon with roasted vegetables and wild rice"
        } else if (timeOfDay == "after dinner") {
            "After Dinner Snack: Dark chocolate covered strawberries"
        } else {
            // Display error for invalid input
            errorMessageTextView.text = "Invalid time of day.Please enter:morning,mid-morning,afternoon,mid-afternoon,dinner,or after dinner"
            return
        }


        // Display the meal suggestion
        mealSuggestionTextView.text = mealSuggestion
    }

    /**
     * Resets the input field and clears the meal suggestion and error message
     */
    private fun resetInputAndSuggestion() {
        // Clear the EditText field
        timeOfDayEditText.text.clear()

        // Clear the meal suggestion and error message
        mealSuggestionTextView.text = ""
        errorMessageTextView.text = ""
    }
}

// Title: Variables
// Author:W3schools
// Version: 1.0
// Available: https://www.w3schools.com/java/java_variables_print.asp



