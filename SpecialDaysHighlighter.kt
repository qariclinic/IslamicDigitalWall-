package com.example.islamicdigitalwall.utils

import java.util.*

class SpecialDaysHighlighter {
    fun isSpecialDay(date: Date): String? {
        val calendar = Calendar.getInstance()
        calendar.time = date
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        return when {
            month == Calendar.JUNE && day == 1 -> "رمضان کا آغاز"
            month == Calendar.JULY && day == 21 -> "عید الفطر"
            month == Calendar.AUGUST && day == 11 -> "عید الاضحی"
            else -> null
        }
    }
}
        
