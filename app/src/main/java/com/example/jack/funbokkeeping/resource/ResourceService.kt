package com.example.jack.funbokkeeping.resource

import android.content.Context
import androidx.core.content.ContextCompat

class ResourceService : IResourceService {

    private lateinit var context: Context

    override fun init(context: Context) {
        this.context = context
    }

    override fun getString(res: Int): String {
        return context.getString(res)
    }

    override fun getColor(res: Int): Int {
        return ContextCompat.getColor(context, res)
    }
}
