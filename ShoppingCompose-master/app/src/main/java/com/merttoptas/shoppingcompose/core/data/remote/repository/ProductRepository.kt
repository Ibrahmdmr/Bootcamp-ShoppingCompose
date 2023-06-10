package com.ibrahimdmr.shoppingcompose.core.data.remote.repository

import com.ibrahimdmr.shoppingcompose.core.data.model.ProductResponse

/**
 * Created by mertcantoptas on 01.06.2023
 */
interface ProductRepository {
    suspend fun getProducts(): Result<List<ProductResponse>>
    suspend fun getProductDetail(id: Int): Result<ProductResponse>
}
