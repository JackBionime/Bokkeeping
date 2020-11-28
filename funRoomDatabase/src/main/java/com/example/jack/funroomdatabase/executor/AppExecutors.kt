package com.bionime.bionimeutils.excutor

object AppExecutors : IAppExecutors {

    override val diskIO: DiskIOThreadExecutor by lazy {
        DiskIOThreadExecutor()
    }
    override val main: MainThreadExecutor by lazy {
        MainThreadExecutor()
    }
    override val singleUpload: SingleUploadExecutor by lazy {
        SingleUploadExecutor()
    }
}
