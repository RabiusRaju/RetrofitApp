package com.pranrflgroup.retrofitexp.model

import com.google.gson.annotations.SerializedName

/**
 * Created by MD.Rabius sani raju on 4/20/22.
 */
data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)
