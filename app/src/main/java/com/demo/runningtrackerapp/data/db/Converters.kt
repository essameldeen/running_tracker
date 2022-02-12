package com.demo.runningtrackerapp.data.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream

class Converters {


    @TypeConverter
    fun fromByteArrayToBitmap(byteArray: ByteArray): Bitmap {

        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)

    }

    @TypeConverter
    fun fromBitMapToByteArray(bitmap: Bitmap): ByteArray {
        val outputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        return outputStream.toByteArray()
    }
}