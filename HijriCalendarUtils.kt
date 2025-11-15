package com.example.islamicdigitalwall.utils

import com.github.msarhan.ummalqura.calendar.UmmalquraCalendar
import java.util.*

class HijriCalendarUtils {
    fun getHijriDate(gregorianDate: Date): String {
        val hijri = UmmalquraCalendar()
        hijri.time = gregorianDate
        return "${hijri.get(Calendar.DAY_OF_MONTH)} ${hijri.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale("ar"))} ${hijri.get(Calendar.YEAR)}"
    }
}
        
