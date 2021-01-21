package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*

enum class TimeUnits { SECOND, MINUTE, HOUR, DAY }

fun Date.format(pattern: String = "HH:mm:ss dd.MM.yy") = SimpleDateFormat(pattern, Locale("ru")).format(this)

fun Date.add(value: Int, units: TimeUnits = TimeUnits.SECOND): Date {
    val date = Date()
    date.time = this.time + value * when (units) {
        TimeUnits.SECOND -> 1L
        TimeUnits.MINUTE -> value * 60L
        TimeUnits.HOUR -> value * 60 * 60L
        TimeUnits.DAY -> value * 24 * 60 * 60L
    }
    return date
}