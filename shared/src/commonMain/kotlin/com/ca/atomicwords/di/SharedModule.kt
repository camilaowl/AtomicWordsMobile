package com.ca.atomicwords.di

import com.ca.auth.di.authModule
import com.ca.core.auth.di.authenticationModule
import com.ca.network.di.networkModule
import org.koin.dsl.module

val sharedModule = module {
    includes(
        networkModule,
        authenticationModule("BuildConfig.WEB_CLIENT_ID"),
        authModule
    )
}