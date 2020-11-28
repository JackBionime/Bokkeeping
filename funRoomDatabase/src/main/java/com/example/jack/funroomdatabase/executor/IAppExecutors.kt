package com.bionime.bionimeutils.excutor

import java.util.concurrent.Executor

/**
 * Created by Michael.Lien
 * on 2019/3/14
 */
interface IAppExecutors {

    val diskIO: Executor

    val main: Executor

    val singleUpload: Executor
}