package com.example.jack.funbokkeeping

import android.app.Application
import com.example.jack.funbokkeeping.resource.ResourceService

class FunApplication : Application() {

    companion object {
        lateinit var resourceService: ResourceService
        lateinit var application: FunApplication
    }

    override fun onCreate() {
        super.onCreate()
        resourceService = ResourceService()
        resourceService.init(this)
        application = this
    }
}
