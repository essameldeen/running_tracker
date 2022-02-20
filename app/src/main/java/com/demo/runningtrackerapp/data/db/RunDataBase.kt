package com.demo.runningtrackerapp.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.demo.runningtrackerapp.data.db.Converters
import com.demo.runningtrackerapp.data.db.Run
import com.demo.runningtrackerapp.data.db.RunDao


@Database(entities = [Run::class], version = 1)
@TypeConverters(Converters::class)
abstract class RunDataBase : RoomDatabase() {
    abstract fun getRunDao(): RunDao
}