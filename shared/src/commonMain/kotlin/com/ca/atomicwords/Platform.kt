package com.ca.atomicwords

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform