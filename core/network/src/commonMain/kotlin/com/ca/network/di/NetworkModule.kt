package com.ca.network.di

import io.ktor.client.HttpClient
import org.koin.dsl.module

val networkModule = module {

    factory { HttpClient() }
}