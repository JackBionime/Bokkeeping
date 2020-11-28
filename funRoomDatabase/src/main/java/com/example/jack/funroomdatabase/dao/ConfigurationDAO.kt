package com.example.jack.funroomdatabase.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.jack.funroomdatabase.entity.ConfigurationEntity

@Dao
interface ConfigurationDAO {

    @Insert
    fun insert(configurationEntity: ConfigurationEntity): Long

    @Update
    fun updateConfig(configurationEntity: ConfigurationEntity)

    @Query("SELECT * FROM Configuration WHERE section = :section AND name = :name")
    fun getConfigEntity(section: String, name: String): ConfigurationEntity?

    @Query("UPDATE Configuration SET value = :value WHERE section = :section AND name = :name")
    fun updateIfExist(section: String, name: String, value: String): Int
}