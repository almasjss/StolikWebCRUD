package kz.com.midtermproject

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import com.google.gson.annotations.SerializedName

@Parcelize
data class Movie(
    @SerializedName("id")
    val id : String ?,

    @SerializedName("title")
    val title : String?,

    @SerializedName("poster_path")
    val poster : String?,

    @SerializedName("release_date")
    val release : String?,

    @SerializedName("overview")
    val info : String?,

    @SerializedName("vote_average")
    val rating:String?


) : Parcelable{
    constructor() : this("", "", "", "","","")
}
