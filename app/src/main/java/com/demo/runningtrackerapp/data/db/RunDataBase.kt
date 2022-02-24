package com.demo.runningtrackerapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.demo.runningtrackerapp.data.model.Run


@Database(entities = [Run::class], version = 1)
@TypeConverters(Converters::class)
abstract class RunDataBase : RoomDatabase() {
    abstract fun getRunDao(): RunDao
}