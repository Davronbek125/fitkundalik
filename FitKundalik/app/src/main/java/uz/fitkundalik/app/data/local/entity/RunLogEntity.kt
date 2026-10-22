package uz.fitkundalik.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "run_logs")
data class RunLogEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val startTime: Long,
    val durationSeconds: Long,
    val distanceMeters: Float,
    val avgSpeedKmh: Float,
    val caloriesBurned: Int,
    val avgPaceSecondsPerKm: Int
)
