package com.demo.runningtrackerapp.app

import android.content.Context
import androidx.room.Room
import com.demo.runningtrackerapp.data.db.RunDataBase
import com.demo.runningtrackerapp.data.db.RunDao
import com.demo.runningtrackerapp.repository.MainRepo
import com.demo.runningtrackerapp.repository.MainRepoImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideDao(db: RunDataBase) = db.getRunDao()

    @Provides
    @Singleton
    fun provideDataBaseInstance(@ApplicationContext app: Context) = Room.databaseBuilder(
        app,
        RunDataBase::class.java,
        "running_db "
    ).build()

    @Singleton
    @Provides
    fun provideRunRepo(
        dao: RunDao,
    ): MainRepo {
        return MainRepoImp(
            dao = dao
        )
    }


}