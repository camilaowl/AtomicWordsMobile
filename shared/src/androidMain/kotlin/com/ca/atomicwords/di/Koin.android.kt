package com.ca.atomicwords.di

import org.koin.android.logger.AndroidLogger
import org.koin.core.logger.Logger
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    single<Logger> { AndroidLogger() }
}