package com.ibrahimdmr.shoppingcompose.core.data.remote.repository.impl

import com.ibrahimdmr.shoppingcompose.core.data.model.ProductResponse
import com.ibrahimdmr.shoppingcompose.core.data.remote.repository.ProductRepository
import com.ibrahimdmr.shoppingcompose.core.data.remote.source.ProductRemoteDataSource
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val productRemoteDataSource: ProductRemoteDataSource
) : ProductRepository {

    override suspend fun getProducts(): Result<List<ProductResponse>> {
        return productRemoteDataSource.getProducts()
    }

    override suspend fun getProductDetail(id: Int): Result<ProductResponse> {
        return productRemoteDataSource.getProductDetail(id)
    }
}
