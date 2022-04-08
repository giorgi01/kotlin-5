package com.example.task5.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.task5.data.DailyActivity

@Database(entities = [DailyActivity::class], version = 1)
abstract class DailyActivityDatabase : RoomDatabase() {
    abstract fun getDailyActivityDao() : DailyActivityDao
}