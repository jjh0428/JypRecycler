package sungil.myjyprecycler2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Album(
    var title: String,
    var info: String,
    var imgUrl: String
) : Parcelable
