package com.ibrahimdmr.shoppingcompose.core.data.remote.repository.impl

import com.ibrahimdmr.shoppingcompose.core.data.model.LoginResponse
import com.ibrahimdmr.shoppingcompose.core.data.remote.repository.AuthRepository
import com.ibrahimdmr.shoppingcompose.core.data.remote.source.AuthRemoteDataSource
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val authRemoteDataSource: AuthRemoteDataSource
) : AuthRepository {
    override suspend fun login(username: String, password: String): Result<LoginResponse> {
        return authRemoteDataSource.login(username, password)
    }
}
