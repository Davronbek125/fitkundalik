package uz.fitkundalik.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercises")
data class ExerciseEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val category: String, // e.g., "NECK", "BACK", "LEGS", "CARDIO"
    val description: String,
    val isRepBased: Boolean,
    val defaultRepsOrSeconds: Int,
    val animationAsset: String
)
