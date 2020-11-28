package com.example.jack.funroomdatabase

import android.content.Context
import com.bionime.bionimeutils.excutor.AppExecutors
import com.bionime.bionimeutils.excutor.IAppExecutors
import com.example.jack.funroomdatabase.dao.ConfigurationDAO
import com.example.jack.funroomdatabase.data_source.IConfigLocalDataSource
import com.example.jack.funroomdatabase.implement.ConfigurationImpl
import java.util.concurrent.Executor

class DatabaseManager(
    context: Context,
    override val diskIO: Executor,
    override val main: Executor,
    override val singleUpload: Executor
) : IDatabaseManager, IAppExecutors {

    private var configurationDAO: ConfigurationDAO

    companion object {
        var instance: DatabaseManager? = null

        fun getInstance(context: Context, appExecutors: AppExecutors): DatabaseManager? {
            if (instance == null) {
                instance = DatabaseManager(
                    context,
                    appExecutors.diskIO,
                    appExecutors.main,
                    appExecutors.singleUpload
                )
            }
            return instance
        }
    }

    init {
        val roomDatabase = FunRoomDatabase.initDatabase(context)
        configurationDAO = roomDatabase.configurationDAO()
    }

    override fun configurationImpl(): IConfigLocalDataSource {
        return ConfigurationImpl(configurationDAO, this)
    }
}