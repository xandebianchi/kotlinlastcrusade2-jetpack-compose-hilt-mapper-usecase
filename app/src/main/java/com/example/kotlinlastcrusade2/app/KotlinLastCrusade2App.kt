package com.example.kotlinlastcrusade2.app

import android.app.Application
import com.example.kotlinlastcrusade2.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class KotlinLastCrusade2App : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
