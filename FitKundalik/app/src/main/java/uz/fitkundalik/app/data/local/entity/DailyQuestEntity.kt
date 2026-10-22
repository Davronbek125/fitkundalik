package uz.fitkundalik.app.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "daily_quests")
data class DailyQuestEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val date: String, // YYYY-MM-DD format
    val title: String,
    val targetCount: Int,
    val currentCount: Int,
    val questType: String, // "EXERCISE" or "RUN"
    val xpReward: Int,
    val isCompleted: Boolean
)
