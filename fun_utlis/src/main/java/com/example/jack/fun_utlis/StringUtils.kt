package com.example.jack.fun_utlis

import java.util.*
import java.util.regex.Pattern

object StringUtils {
    fun isChinese(text: String): Boolean {
        try {
            val chArray = text.toCharArray()
            for (i in chArray.indices) {
                val ub = Character.UnicodeBlock.of(chArray[i])
                return ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return false
    }

    fun checkQRCodeTxt(text: String): Boolean {
        // NOTE 若需要有底線或dash -> [^_a-zA-Z0-9_-]
        val pattern = Pattern.compile("[^_a-zA-Z0-9]")
        val matcher = pattern.matcher(text)
        return matcher.find()
    }

    fun isLanguageIsTw(): Boolean {
        return Locale.getDefault().language == "zh"
    }
}