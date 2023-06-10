package com.ibrahimdmr.shoppingcompose.core.data.remote.api

import com.ibrahimdmr.shoppingcompose.core.data.model.ProductResponse
import retrofit2.http.GET

interface ProductService {
    @GET("products")
    suspend fun getProducts(): List<ProductResponse>

    @GET("products/{id}")
    suspend fun getProductDetail(id: Int): ProductResponse
}
