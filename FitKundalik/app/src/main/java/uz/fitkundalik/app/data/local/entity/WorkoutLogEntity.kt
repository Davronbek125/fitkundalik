package uz.fitkundalik.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "workout_logs")
data class WorkoutLogEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val exerciseId: Long,
    val timestamp: Long,
    val setsCompleted: Int,
    val totalReps: Int,
    val totalDurationSeconds: Int
)
