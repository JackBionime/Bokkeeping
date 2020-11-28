package com.bionime.bionimeutils.excutor

import java.util.concurrent.Executor
import java.util.concurrent.Executors

class DiskIOThreadExecutor : Executor {

    private val diskIO: Executor by lazy { Executors.newFixedThreadPool(4) }

    override fun execute(command: Runnable) {
        diskIO.execute(command)
    }
}
