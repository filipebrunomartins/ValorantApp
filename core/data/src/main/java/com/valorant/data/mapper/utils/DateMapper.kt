package com.valorant.data.mapper.utils

import com.valorant.data.utils.Mapper
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject

class DateMapper @Inject constructor() : Mapper<String, Date?> {

    //Todo multi Locale
    private val formatter = SimpleDateFormat("yyyy-MM-dd", Locale.US)

    override fun mapFromApiResponse(type: String): Date? {
        return type.let {
            formatter.parse(it)
        }
    }
}