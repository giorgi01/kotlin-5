package com.example.task5.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface DailyActivityDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addDailyActivity(activity: DailyActivity);

    @Query("SELECT * FROM daily_activities")
    fun readAllData(): List<DailyActivity>
}