package com.example.task5.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "daily_activities")
data class DailyActivity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val runDistance: Double, // კილომეტრებში
    val swimDistance: Double,
    val caloriesGot: Int
)