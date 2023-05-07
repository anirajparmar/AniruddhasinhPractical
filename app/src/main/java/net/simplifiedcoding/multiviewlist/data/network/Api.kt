package net.simplifiedcoding.multiviewlist.data.network

import net.simplifiedcoding.multiviewlist.data.model.PhotoModel
import retrofit2.http.GET

interface Api {

    @GET("photos")
    suspend fun getPhotos(): List<PhotoModel>

//    @GET("directors")
//    suspend fun getDirectors(): List<HomeRecyclerViewItem.Director>
}