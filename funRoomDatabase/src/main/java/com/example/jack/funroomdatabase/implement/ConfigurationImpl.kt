package com.example.jack.funroomdatabase.implement

import com.bionime.bionimeutils.excutor.IAppExecutors
import com.example.jack.funroomdatabase.dao.ConfigurationDAO
import com.example.jack.funroomdatabase.data_source.IConfigLocalDataSource
import com.example.jack.funroomdatabase.entity.ConfigurationEntity

/**
 * Created by dion on 2019/03/26.
 */
class ConfigurationImpl(
    private val configDao: ConfigurationDAO,
    appExecutor: IAppExecutors
) : IConfigLocalDataSource,
    IAppExecutors by appExecutor {

    override fun setConfig(section: String, name: String, value: String) {
        diskIO.execute {
            val updateResult = configDao.updateIfExist(section, name, value)
            if (updateResult == 0) {
                val configurationEntity = ConfigurationEntity()
                configurationEntity.section = section
                configurationEntity.name = name
                configurationEntity.value = value
                configDao.insert(configurationEntity)
            }
        }
    }

    override fun getConfig(section: String, name: String, defaultValue: String): String {
        return configDao.getConfigEntity(section, name)?.value ?: defaultValue
    }
}