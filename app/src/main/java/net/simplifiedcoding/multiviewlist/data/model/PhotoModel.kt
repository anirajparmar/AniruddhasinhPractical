package net.simplifiedcoding.multiviewlist.data.model

data class PhotoModel(
    val albumId: Int,
    val id: Int,
    val thumbnailUrl: String,
    val title: String,
    val url: String
) : java.io.Serializable