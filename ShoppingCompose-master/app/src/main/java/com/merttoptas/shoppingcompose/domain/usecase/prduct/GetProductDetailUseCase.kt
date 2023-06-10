package com.ibrahimdmr.shoppingcompose.domain.usecase.prduct

import com.ibrahimdmr.shoppingcompose.core.data.model.ProductResponse
import com.ibrahimdmr.shoppingcompose.core.data.remote.repository.ProductRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * Created by on 01.06.2023
 */
class GetProductDetailUseCase @Inject constructor(private val productRepository: ProductRepository) {
    operator fun invoke(id: Int): Flow<ProductResponse> {
        return flow {
            val result = productRepository.getProductDetail(id)
            (result.getOrNull() ?: throw IllegalArgumentException("error message")).also {
                emit(it)
            }
        }
    }
}
