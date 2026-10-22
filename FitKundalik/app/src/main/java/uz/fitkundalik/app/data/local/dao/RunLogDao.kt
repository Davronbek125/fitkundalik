package uz.fitkundalik.app.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import uz.fitkundalik.app.data.local.entity.RunLogEntity

@Dao
interface RunLogDao {
    @Query("SELECT * FROM run_logs ORDER BY startTime DESC")
    fun getAllRunLogs(): Flow<List<RunLogEntity>>

    @Insert
    suspend fun insertRunLog(log: RunLogEntity)
}
