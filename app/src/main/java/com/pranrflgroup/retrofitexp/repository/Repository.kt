package com.pranrflgroup.retrofitexp.repository

import com.pranrflgroup.retrofitexp.api.RetrofitInstance
import com.pranrflgroup.retrofitexp.model.Post
import retrofit2.Response

/**
 * Created by MD.Rabius sani raju on 4/20/22.
 */
class Repository {
    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }
}