package com.bionime.bionimeutils.excutor

import java.util.concurrent.Executor
import java.util.concurrent.Executors

/**
 * Created by Michael.Lien
 * on 2018/12/27
 */
class SingleUploadExecutor : Executor {

    private val singleUpload by lazy { Executors.newFixedThreadPool(1) }

    override fun execute(command: Runnable?) {
        singleUpload.execute(command)
    }
}