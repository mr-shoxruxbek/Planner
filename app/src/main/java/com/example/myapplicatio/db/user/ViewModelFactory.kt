package com.example.myapplicatio.db.user

import android.app.Application
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.myapplicatio.db.task.TaskModelView
import javax.inject.Inject

@Suppress("UNCHECKED_CAST")
class ViewModelFactory @Inject constructor(private val app: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(TaskModelView::class.java)) {
            TaskModelView(this.app) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }

}