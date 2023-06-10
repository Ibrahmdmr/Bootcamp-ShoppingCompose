package com.ibrahimdmr.shoppingcompose.core.data.remote.source

import com.ibrahimdmr.shoppingcompose.core.data.model.LoginBody
import com.ibrahimdmr.shoppingcompose.core.data.model.LoginResponse
import com.ibrahimdmr.shoppingcompose.core.data.remote.api.AuthService
import javax.inject.Inject

class AuthRemoteDataSourceImpl @Inject constructor(
    private val authService: AuthService
) : AuthRemoteDataSource {
    override suspend fun login(username: String, password: String): Result<LoginResponse> {
        return runCatching {
            authService.login(LoginBody(username, password))
        }
    }
}
