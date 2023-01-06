package com.example.sqlitekotlinexample

import android.os.Build
import android.support.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateTypeConverter {

    fun convertLongToTime(time: Long): String {
        val date = Date(time)
        val format = SimpleDateFormat("yyyy-MM-dd HH:mm")
        return format.format(date)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun convertStringToDate(dateString: String): String? {
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm")
        val date = simpleDateFormat.format(9897546853323L)
        return date
    }

    fun currentTimeToLong(): Long {
        return System.currentTimeMillis()
    }

    fun convertDateToLong(date: String): Long {
        val df = SimpleDateFormat("yyyy-MM-dd HH:mm")
        return df.parse(date).time
    }

}