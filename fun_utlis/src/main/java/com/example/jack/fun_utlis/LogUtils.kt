@file:JvmName("LogUtils")

package com.example.jack.fun_utlis

import android.util.Log

/**
 * Created by Michael.Lien
 * on 2018/10/22
 */

fun <T : Any> T.logV(
    msg: String,
    tag: String = this::class.java.simpleName,
    isDeBug: Boolean = BuildConfig.DEBUG
) {
    if (isDeBug) Log.v(tag, msg)
}

fun <T : Any> T.logD(
    msg: String,
    tag: String = this::class.java.simpleName,
    isDeBug: Boolean = BuildConfig.DEBUG
) {
    if (isDeBug) Log.d(tag, msg)
}

fun <T : Any> T.logI(
    msg: String,
    tag: String = this::class.java.simpleName,
    isDeBug: Boolean = BuildConfig.DEBUG
) {
    if (isDeBug) Log.i(tag, msg)
}

fun <T : Any> T.logW(
    msg: String,
    tag: String = this::class.java.simpleName,
    isDeBug: Boolean = BuildConfig.DEBUG
) {
    if (isDeBug) Log.w(tag, msg)
}

fun <T : Any> T.logE(
    msg: String,
    tag: String = this::class.java.simpleName,
    isDeBug: Boolean = BuildConfig.DEBUG
) {
    if (isDeBug) Log.e(tag, msg)
}

fun <T : Any> T.logWTF(
    msg: String,
    tag: String = this::class.java.simpleName,
    isDeBug: Boolean = BuildConfig.DEBUG
) {
    if (isDeBug) Log.wtf(tag, msg)
}

fun <T : Any> T.printlog(collection: Collection<String>): String {
    val str: StringBuilder = StringBuilder()
    collection.forEach {
        str.append("$it\n")
    }
    return str.toString()
}
