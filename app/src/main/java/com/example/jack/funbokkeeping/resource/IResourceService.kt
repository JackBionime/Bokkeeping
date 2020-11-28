package com.example.jack.funbokkeeping.resource

import android.content.Context
import androidx.annotation.ColorRes
import androidx.annotation.StringRes

interface IResourceService {

    fun init(context: Context)

    fun getString(@StringRes res: Int): String

    fun getColor(@ColorRes res: Int): Int
}
