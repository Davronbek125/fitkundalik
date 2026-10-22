package uz.fitkundalik.app.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import uz.fitkundalik.app.data.local.entity.DailyQuestEntity

@Dao
interface DailyQuestDao {
    @Query("SELECT * FROM daily_quests WHERE date = :date")
    fun getQuestsByDate(date: String): Flow<List<DailyQuestEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuests(quests: List<DailyQuestEntity>)

    @Update
    suspend fun updateQuest(quest: DailyQuestEntity)
}
