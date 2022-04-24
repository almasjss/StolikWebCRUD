package kz.com.firstnamelastnameq1


import com.google.gson.annotations.SerializedName

data class InfoItem(
    @SerializedName("title")
    val title: String, // Title 400
    @SerializedName("url")
    val url: String // https://picsum.photos/id/400/200/100
)