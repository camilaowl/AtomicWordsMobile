package com.ca.atomicwords

import android.app.Application
import com.ca.atomicwords.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class AtomicWordsApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@AtomicWordsApplication)
            androidLogger()
        }
    }
}