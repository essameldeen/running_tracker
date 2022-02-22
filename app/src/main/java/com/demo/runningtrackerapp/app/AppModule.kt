package com.demo.runningtrackerapp.app

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import androidx.room.Room
import com.demo.runningtrackerapp.data.db.RunDataBase
import com.demo.runningtrackerapp.data.db.RunDao
import com.demo.runningtrackerapp.repository.MainRepo
import com.demo.runningtrackerapp.repository.MainRepoImp
import com.demo.runningtrackerapp.utils.Constants.KEY_FIRST_TIME_TOGGLE
import com.demo.runningtrackerapp.utils.Constants.KEY_NAME
import com.demo.runningtrackerapp.utils.Constants.KEY_WEIGHT
import com.demo.runningtrackerapp.utils.Constants.SHARED_PREFERENCE_NAME
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


  @Singleton
  @Provides
  fun provideSharedPreference(@ApplicationContext context: Context) =
    context.getSharedPreferences(SHARED_PREFERENCE_NAME, MODE_PRIVATE)

  @Singleton
  @Provides
  fun provideName(pref: SharedPreferences) = pref.getString(KEY_NAME, "")

  @Singleton
  @Provides
  fun provideWeight(pref: SharedPreferences) = pref.getFloat(KEY_WEIGHT, 80F)

  @Singleton
  @Provides
  fun provideFirstToggle(pref: SharedPreferences) = pref.getBoolean(KEY_FIRST_TIME_TOGGLE, true)


}