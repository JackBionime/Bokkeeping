package com.example.jack.fun_utlis

import android.content.Intent
import android.net.Uri
import kotlin.reflect.KProperty

/**
 * Created by Michael.Lien
 * on 2018/10/23
 */
open class IntentExtraString(private val key: String) {
    operator fun getValue(intent: Intent, property: KProperty<*>): String? =
        intent.getStringExtra(key)

    operator fun setValue(intent: Intent, property: KProperty<*>, value: String?) {
        intent.putExtra(key, value)
    }
}

open class IntentExtraInt(private val key: String) {
    operator fun getValue(intent: Intent, property: KProperty<*>): Int =
        intent.getIntExtra(key, -1)

    operator fun setValue(intent: Intent, property: KProperty<*>, value: Int) {
        intent.putExtra(key, value)
    }
}

open class IntentExtraBoolean(private val key: String) {
    operator fun getValue(intent: Intent, property: KProperty<*>): Boolean =
        intent.getBooleanExtra(key, false)

    operator fun setValue(intent: Intent, property: KProperty<*>, value: Boolean) {
        intent.putExtra(key, value)
    }
}

