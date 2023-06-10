package com.ibrahimdmr.shoppingcompose.domain.usecase.prduct

import com.ibrahimdmr.shoppingcompose.core.data.model.ProductResponse
import com.ibrahimdmr.shoppingcompose.core.data.remote.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetProductsUseCase @Inject constructor(private val productRepository: ProductRepository) {
    operator fun invoke(): Flow<List<ProductResponse>> {
        return flow {
            val result = productRepository.getProducts()
            (result.getOrNull() ?: throw IllegalArgumentException("error message")).also {
                emit(it)
            }
        }
    }
}
