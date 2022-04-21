package com.pranrflgroup.retrofitexp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pranrflgroup.retrofitexp.repository.Repository

/**
 * Created by MD.Rabius sani raju on 4/20/22.
 */
class MainViewModelFactory(
    private val repository: Repository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }

}