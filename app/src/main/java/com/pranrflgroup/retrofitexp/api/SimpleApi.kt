package com.pranrflgroup.retrofitexp.api

import com.pranrflgroup.retrofitexp.model.Post
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by MD.Rabius sani raju on 4/20/22.
 */
interface SimpleApi {

    @GET("posts/1")
    suspend fun getPost(): Response<Post>
}