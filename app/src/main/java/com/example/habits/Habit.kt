package com.example.habits

data class Habit(val title: String, val description: String, val image: Int)

fun getSampleHabits(): List<Habit> {
    return listOf(
            Habit("Go for a walk",
                    "A nice walk in the sun",
                R.drawable.water),

            Habit("Drink glass of water",
                "A refreshing  glass of water gets u started",
                R.drawable.water)
    )
}