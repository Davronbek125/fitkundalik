package uz.fitkundalik.app.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import uz.fitkundalik.app.data.local.dao.DailyQuestDao
import uz.fitkundalik.app.data.local.dao.ExerciseDao
import uz.fitkundalik.app.data.local.dao.RunLogDao
import uz.fitkundalik.app.data.local.dao.WorkoutLogDao
import uz.fitkundalik.app.data.local.entity.DailyQuestEntity
import uz.fitkundalik.app.data.local.entity.ExerciseEntity
import uz.fitkundalik.app.data.local.entity.RunLogEntity
import uz.fitkundalik.app.data.local.entity.WorkoutLogEntity

@Database(
    entities = [
        ExerciseEntity::class,
        DailyQuestEntity::class,
        WorkoutLogEntity::class,
        RunLogEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exerciseDao(): ExerciseDao
    abstract fun dailyQuestDao(): DailyQuestDao
    abstract fun workoutLogDao(): WorkoutLogDao
    abstract fun runLogDao(): RunLogDao
}
