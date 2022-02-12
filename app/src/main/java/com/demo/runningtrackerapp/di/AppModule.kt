package com.demo.runningtrackerapp.di

import android.content.Context
import androidx.room.Room
import com.demo.runningtrackerapp.data.DataBase
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
    fun provideDao(db: DataBase) = db.getRunDao()

    @Provides
    @Singleton
    fun provideDataBaseInstance(@ApplicationContext app: Context) = Room.databaseBuilder(
        app,
        DataBase::class.java,
        "running_db "
    ).build()
}