package com.example.islamicdigitalwall.utils

import com.batoulapps.adhan.*
import java.util.*

class PrayerTimesCalculator {
    fun getPrayerTimes(latitude: Double, longitude: Double, date: Date): PrayerTimes {
        val coordinates = Coordinates(latitude, longitude)
        val params = CalculationMethod.KARACHI.getParameters()
        params.madhab = Madhab.HANAFI
        return PrayerTimes(coordinates, date, params)
    }
}
