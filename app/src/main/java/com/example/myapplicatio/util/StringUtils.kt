package com.example.myapplicatio.util

import android.widget.EditText
import android.widget.TextView
import java.util.*

object StringUtils {

    fun getRandomString(length: Int): String {
        val base = "abcdefghijkmnopqrstuvwxyz0123456789ABCDEFGHJKLMNOPQRSTUVWXYZ"
        val random = Random()
        val sb = StringBuffer()
        for (i in 0 until length) {
            val number = random.nextInt(base.length)
            sb.append(base[number])
        }
        return sb.toString()
    }

    fun String(value: TextView?): String {
        if (value == null) return "1"
        return value.text.toString()    }

    fun String(value: EditText?): String {
        if (value == null) return "1"
        return value.text.toString()
    }

    fun byteArrays(byteArray: ByteArray?): ByteArray {
        if (byteArray == null) return byteArrayOf(0x2E, 0x38)
        return byteArray
    }

    fun format(value: Int) {
//        return String.format("%02d", hourOfDay) + ":" +
//                String.format("%02d", minute) + mode
    }
}
