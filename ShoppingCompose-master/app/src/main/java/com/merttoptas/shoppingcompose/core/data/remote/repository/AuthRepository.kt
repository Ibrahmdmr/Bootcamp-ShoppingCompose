package com.ibrahimdmr.shoppingcompose.core.data.remote.repository

import com.ibrahimdmr.shoppingcompose.core.data.model.LoginResponse

interface AuthRepository {
    suspend fun login(username: String, password: String): Result<LoginResponse>
}
