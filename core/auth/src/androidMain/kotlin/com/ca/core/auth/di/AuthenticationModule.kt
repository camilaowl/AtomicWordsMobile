package com.ca.core.auth.di

import android.util.Base64
import androidx.credentials.CredentialManager
import com.google.android.libraries.identity.googleid.GetGoogleIdOption
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module
import java.security.SecureRandom

actual fun authenticationModule(webClientId: String) = module {

    single<CredentialManager> { CredentialManager.create(androidApplication()) }

    single {
        GetGoogleIdOption.Builder()
            .setFilterByAuthorizedAccounts(true)
            .setServerClientId(webClientId)
            .setAutoSelectEnabled(true)
            .setNonce(generateSecureRandomNonce())
            .build()
    }
}

fun generateSecureRandomNonce(byteLength: Int = 32): String {
    val randomBytes = ByteArray(byteLength)
    SecureRandom().nextBytes(randomBytes)
    return Base64.encodeToString(randomBytes, Base64.NO_WRAP or Base64.URL_SAFE or Base64.NO_PADDING)
}