package com.example.task5

import android.app.Application
import androidx.room.Room
import com.example.task5.data.DailyActivityDatabase

class App : Application() {

    lateinit var db: DailyActivityDatabase

    companion object{
        lateinit var instance: App
            private set
    }

    override fun onCreate() {
        super.onCreate()

        instance = this

        db = Room.databaseBuilder(
            applicationContext,
            DailyActivityDatabase::class.java,
            "ActivitiesDb"
        ).allowMainThreadQueries().build()
    }

}