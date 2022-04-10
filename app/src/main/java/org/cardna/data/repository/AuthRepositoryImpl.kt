package org.cardna.data.repository

import org.cardna.data.remote.datasource.AuthDataSource
import org.cardna.data.remote.model.auth.RequestLoginData
import org.cardna.data.remote.model.auth.ResponseLoginData
import org.cardna.domain.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(private val authDataSource: AuthDataSource) :
    AuthRepository {

    override suspend fun getLogin(social: String): ResponseLoginData {
        return authDataSource.getLogin(social=social)
    }
}