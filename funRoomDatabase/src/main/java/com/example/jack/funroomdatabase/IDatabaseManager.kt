package com.example.jack.funroomdatabase

import com.example.jack.funroomdatabase.data_source.IConfigLocalDataSource

interface IDatabaseManager {

    fun configurationImpl() : IConfigLocalDataSource
}