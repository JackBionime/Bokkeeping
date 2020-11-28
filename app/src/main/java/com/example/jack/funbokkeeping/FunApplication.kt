package com.example.jack.funbokkeeping

import android.app.Application
import com.bionime.bionimeutils.excutor.AppExecutors
import com.example.jack.funbokkeeping.resource.IResourceService
import com.example.jack.funbokkeeping.resource.ResourceService
import com.example.jack.funroomdatabase.DatabaseManager
import com.example.jack.funroomdatabase.IDatabaseManager

class FunApplication : Application() {

    companion object {
        lateinit var resourceService: IResourceService
        lateinit var databaseManager: IDatabaseManager
        val application = FunApplication
    }

    override fun onCreate() {
        super.onCreate()
        resourceService = ResourceService()
        resourceService.init(this)
        databaseManager = DatabaseManager.getInstance(this, AppExecutors)!!
    }
}
