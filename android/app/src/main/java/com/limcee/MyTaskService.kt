package com.limcee

import android.content.Intent
import android.util.Log
import com.facebook.react.HeadlessJsTaskService
import com.facebook.react.bridge.Arguments
import com.facebook.react.jstasks.HeadlessJsTaskConfig

class MyTaskService : HeadlessJsTaskService() {
    override fun getTaskConfig(intent: Intent): HeadlessJsTaskConfig? {
        Log.d("MyTaskService", "Service started")
        
        return intent.extras?.let {
            Log.d("MyTaskService", "Configuring task")
            HeadlessJsTaskConfig(
                "SomeTaskName",
                Arguments.fromBundle(it),
                60000,
                true
            )
        }
    }
}


