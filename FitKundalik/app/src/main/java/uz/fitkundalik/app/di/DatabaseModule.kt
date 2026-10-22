package uz.fitkundalik.app.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import uz.fitkundalik.app.data.local.AppDatabase
import uz.fitkundalik.app.data.local.dao.DailyQuestDao
import uz.fitkundalik.app.data.local.dao.ExerciseDao
import uz.fitkundalik.app.data.local.dao.RunLogDao
import uz.fitkundalik.app.data.local.dao.WorkoutLogDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "fitkundalik_db"
        ).build()
    }

    @Provides
    fun provideExerciseDao(db: AppDatabase): ExerciseDao = db.exerciseDao()

    @Provides
    fun provideDailyQuestDao(db: AppDatabase): DailyQuestDao = db.dailyQuestDao()

    @Provides
    fun provideWorkoutLogDao(db: AppDatabase): WorkoutLogDao = db.workoutLogDao()

    @Provides
    fun provideRunLogDao(db: AppDatabase): RunLogDao = db.runLogDao()
}
