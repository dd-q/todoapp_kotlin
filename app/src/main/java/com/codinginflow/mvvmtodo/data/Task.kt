package com.codinginflow.mvvmtodo.data

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.text.DateFormat

@Entity(tableName = "task_table")
@Parcelize
data class Task (
    @PrimaryKey(autoGenerate = true) val id : Int = 0,
    val name : String,
    val importance : Boolean = false,
    val completed : Boolean = false,
    val created : Long = System.currentTimeMillis()
) : Parcelable {
    val createdDataFormatted : String
        get() = DateFormat.getDateTimeInstance().format(created)
}