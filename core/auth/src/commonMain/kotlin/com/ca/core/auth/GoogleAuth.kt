package com.ca.core.auth

expect class GoogleAuth(context: Any = Unit) {
    suspend fun googleIdToken(): GoogleAuthCredential
}