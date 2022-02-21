package com.demo.runningtrackerapp.data.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.demo.runningtrackerapp.data.db.Converters.class})
@androidx.room.Database(entities = {com.demo.runningtrackerapp.data.db.Run.class}, version = 1)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/demo/runningtrackerapp/data/db/RunDataBase;", "Landroidx/room/RoomDatabase;", "()V", "getRunDao", "Lcom/demo/runningtrackerapp/data/db/RunDao;", "app_debug"})
public abstract class RunDataBase extends androidx.room.RoomDatabase {
    
    public RunDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.demo.runningtrackerapp.data.db.RunDao getRunDao();
}