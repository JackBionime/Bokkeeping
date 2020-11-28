package com.example.jack.funroomdatabase.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Configuration")
class ConfigurationEntity {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "ID")
    var id = 0

    @ColumnInfo(name = "Section")
    var section = ""

    @ColumnInfo(name = "Name")
    var name = ""

    @ColumnInfo(name = "value")
    var value = ""
}