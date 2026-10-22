package uz.fitkundalik.app.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import uz.fitkundalik.app.data.local.entity.WorkoutLogEntity

@Dao
interface WorkoutLogDao {
    @Query("SELECT * FROM workout_logs ORDER BY timestamp DESC")
    fun getAllWorkoutLogs(): Flow<List<WorkoutLogEntity>>

    @Insert
    suspend fun insertWorkoutLog(log: WorkoutLogEntity)
}
