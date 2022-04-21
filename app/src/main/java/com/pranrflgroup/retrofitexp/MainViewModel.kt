package com.pranrflgroup.retrofitexp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pranrflgroup.retrofitexp.model.Post
import com.pranrflgroup.retrofitexp.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

/**
 * Created by MD.Rabius sani raju on 4/20/22.
 */
class MainViewModel(private val repository: Repository) : ViewModel() {

    val myResponse : MutableLiveData<Response<Post>> = MutableLiveData()

    fun getPost(){
        viewModelScope.launch {
            val response = repository.getPost()
            myResponse.value = response
        }
    }
}