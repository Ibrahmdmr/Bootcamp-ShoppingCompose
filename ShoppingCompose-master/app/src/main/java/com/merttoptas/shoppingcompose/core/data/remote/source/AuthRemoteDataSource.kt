package com.ibrahimdmr.shoppingcompose.core.data.remote.source

import com.ibrahimdmr.shoppingcompose.core.data.model.LoginResponse

interface AuthRemoteDataSource {
    suspend fun login(username: String, password: String): Result<LoginResponse>
}
