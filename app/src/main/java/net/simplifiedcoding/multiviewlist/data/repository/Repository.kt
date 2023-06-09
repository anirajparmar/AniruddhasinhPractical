package net.simplifiedcoding.multiviewlist.data.repository

import net.simplifiedcoding.multiviewlist.data.network.SafeApiCall
import net.simplifiedcoding.multiviewlist.data.network.Api
import javax.inject.Inject

class Repository @Inject constructor(
    private val api: Api
) : SafeApiCall {
    suspend fun getPhotos() = safeApiCall { api.getPhotos() }
//    suspend fun getDirectors() = safeApiCall { api.getDirectors() }
}