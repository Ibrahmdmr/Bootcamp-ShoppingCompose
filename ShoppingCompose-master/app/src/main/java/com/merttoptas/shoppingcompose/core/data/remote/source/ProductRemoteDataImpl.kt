package com.ibrahimdmr.shoppingcompose.core.data.remote.source

import com.ibrahimdmr.shoppingcompose.core.data.model.ProductResponse
import com.ibrahimdmr.shoppingcompose.core.data.remote.api.ProductService
import javax.inject.Inject

/**
 * Created by mertcantoptas on 01.06.2023
 */
class ProductRemoteDataImpl @Inject constructor(
    private val productService: ProductService
) : ProductRemoteDataSource {

    override suspend fun getProducts(): Result<List<ProductResponse>> {
        return runCatching {
            productService.getProducts()
        }
    }

    override suspend fun getProductDetail(id: Int): Result<ProductResponse> {
        return runCatching {
            productService.getProductDetail(id)
        }
    }
}
