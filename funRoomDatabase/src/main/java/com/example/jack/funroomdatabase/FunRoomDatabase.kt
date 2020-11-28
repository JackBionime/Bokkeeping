package com.example.jack.funroomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.jack.funroomdatabase.dao.ConfigurationDAO
import com.example.jack.funroomdatabase.entity.ConfigurationEntity

@Database(entities = [ConfigurationEntity::class], exportSchema = false, version = 1)
abstract class FunRoomDatabase : RoomDatabase() {

    abstract fun configurationDAO(): ConfigurationDAO

   companion object {
       private val DATABASE_NAME = "fu_database.db"

       fun initDatabase(context: Context): FunRoomDatabase {
           return Room.databaseBuilder(context, FunRoomDatabase::class.java, DATABASE_NAME)
               .allowMainThreadQueries().build()
       }
   }
}

