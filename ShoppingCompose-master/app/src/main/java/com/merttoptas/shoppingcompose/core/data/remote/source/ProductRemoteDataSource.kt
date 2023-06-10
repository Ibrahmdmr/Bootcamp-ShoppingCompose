package com.ibrahimdmr.shoppingcompose.core.data.remote.source

import com.ibrahimdmr.shoppingcompose.core.data.model.ProductResponse

interface ProductRemoteDataSource {
    suspend fun getProducts(): Result<List<ProductResponse>>
    suspend fun getProductDetail(id: Int): Result<ProductResponse>
}
