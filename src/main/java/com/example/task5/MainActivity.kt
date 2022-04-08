package com.example.task5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.task5.data.DailyActivity
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button2)


        btn.setOnClickListener {

            val runDistance =
                findViewById<EditText>(R.id.editTextNumberDecimal).text.toString().toDouble()
            val swimDistance =
                findViewById<EditText>(R.id.editTextNumberDecimal2).text.toString().toDouble()
            val caloriesGot = findViewById<EditText>(R.id.editTextNumber).text.toString().toInt()

            val activityDao = App.instance.db.getDailyActivityDao()
            activityDao.addDailyActivity(DailyActivity(0, runDistance, swimDistance, caloriesGot))

            val result = activityDao.readAllData()
            val objectCount = result.count()
            val distanceCovered = result.sumOf { it.runDistance }

            val runDistanceAvg = distanceCovered / objectCount
            val swimDistanceAvg = result.sumOf { it.swimDistance } / objectCount
            val caloriesGotAvg = result.sumOf { it.caloriesGot } / objectCount

            val avgView = findViewById<TextView>(R.id.textView2)
            avgView.text = "გარბენილი მანძილის დღ.საშუალო: ${runDistanceAvg}კმ\n" +
                        "გაცურული მანძილის დღ.საშუალო: ${swimDistanceAvg}კმ\n" +
                    "მიღებული კალორიების დღ.საშუალო: ${caloriesGotAvg}კკალ\n\n" +
                    "სულ გარბენილი მანძილი: ${distanceCovered}კმ"

        }
    }
}