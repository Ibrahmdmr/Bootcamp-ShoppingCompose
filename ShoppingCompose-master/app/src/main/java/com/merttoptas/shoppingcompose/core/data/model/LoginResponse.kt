package com.ibrahimdmr.shoppingcompose.core.data.model

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("token")
    val token: String?
)
