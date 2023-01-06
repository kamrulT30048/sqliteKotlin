package com.example.sqlitekotlinexample

import java.text.SimpleDateFormat
import java.util.*

class Common {
    fun getCurrentDateTime(): String {
        val dateFormat = SimpleDateFormat("YYYY-MM-DD HH:MM")
        val today = dateFormat.format(Date())

        return today.toString()
    }

    fun convertLongToTime(time: Long): String {
        val date = Date(time)
        val format = SimpleDateFormat("yyyy.MM.dd HH:mm")
        return format.format(date)
    }

    fun currentTimeToLong(): Long {
        return System.currentTimeMillis()
    }

    fun convertDateToLong(date: String): Long {
        val df = SimpleDateFormat("yyyy.MM.dd HH:mm")
        return df.parse(date).time
    }
}