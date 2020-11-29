package com.example.jack.fun_utlis

annotation class DateFormat {

    companion object {
        const val formatDateTime = "yyyyMMddHHmm"
        const val formatDate = "yyyyMMdd"
        const val formatYearMonth = "yyyyMM"
        const val formatTime = "HHmm"
        const val formatContainSecondWithoutSymbol = "yyyyMMddHHmmss"
        const val formatDateNoYear = "MMdd"
        const val formatYear = "yyyy"

        const val formatDateTimeWithDash = "yyyy-MM-dd HH:mm"
        const val formatDateTimeFromNewRecord = "yyyy/MM/dd HH:mm:ss"
        const val formatDateWithDash = "yyyy-MM-dd"
        const val formatTimeWithColon = "HH:mm"

        const val formatDateWithSlash = "yyyy/MM/dd"
        const val formatDateTimeWithSlashAndColon = "yyyy/MM/dd HH:mm"
        const val formatDateTimeWithSlashAndColonNoYear = "MM/dd HH:mm"
        const val formatTimeWithSlashFor12Hour = "yyyy/MM/dd hh:mm aa"
        const val formatTimeWithSlashFor12HourNoYear = "MM/dd hh:mm aa"
        const val formatTimeWithSlashFor12HourNoYearForLanguageZh = "MM/dd aa hh:mm"
        const val formatTimeSecond = "ss"

        const val formatTimeWithColonAndMark = "hh:mm@a"
        const val formatTimeWithColonAndMarkFront = "aa hh:mm"
        const val formatTimeWithColonAndMarkEnglish = "hh:mm aa"

        const val formatTimeWithSlashWeekendFor12Hour = "yyyy/MM/dd EEE hh:mm aa"
        const val formatTimeWithSlashWeekendFor24Hour = "yyyy/MM/dd EEE HH:mm"

        const val formatTimeWithImageFile = "yyyyMMdd_HHmmss"

        const val formatTimeWithTicketComment = "yyyy-MM-dd'T'HH:mm:ss'Z'"
    }
}