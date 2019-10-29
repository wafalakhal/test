package com.mobilite.core.domain
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
    data class Photo(
        val id: String,
        val created_at: String,
        val updated_at: String,
        val promoted_at: String,
        val width: Int,
        val height: Int,
        val color: String,
        val description: String,
        val alt_description: String,
        val urls: @RawValue Url
    ) : Parcelable



