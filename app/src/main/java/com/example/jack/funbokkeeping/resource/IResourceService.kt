package com.example.jack.funbokkeeping.resource

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

interface IResourceService {

    fun init(context: Context)

    fun getString(@StringRes res: Int): String

    fun getColor(@ColorRes res: Int): Int

    fun getDrawable(@DrawableRes res: Int): Drawable?
}
