package com.example.jack.funroomdatabase.data_source

/**
 * Created by dion on 2019/03/26.
 */
interface IConfigLocalDataSource {
    fun setConfig(section: String, name: String, value: String)

    fun getConfig(section: String, name: String, defaultValue: String): String
}