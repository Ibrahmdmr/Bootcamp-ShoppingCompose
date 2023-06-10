package com.ibrahimdmr.shoppingcompose.core.data.remote.api

import com.ibrahimdmr.shoppingcompose.core.data.model.LoginBody
import com.ibrahimdmr.shoppingcompose.core.data.model.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {

   @POST("auth/login")
   suspend fun login(
       @Body requestBody: LoginBody,
   ) : LoginResponse
}
