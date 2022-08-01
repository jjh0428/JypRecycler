package sungil.myjyprecycler2

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Singer(
    var name: String,
    var info: String,
    var imgUrl: String,
    val albumList: List<Album>
) : Parcelable