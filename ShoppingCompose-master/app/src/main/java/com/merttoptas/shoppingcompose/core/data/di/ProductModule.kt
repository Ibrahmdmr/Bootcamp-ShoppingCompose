package com.ibrahimdmr.shoppingcompose.core.data.di

import com.ibrahimdmr.shoppingcompose.core.data.remote.repository.ProductRepository
import com.ibrahimdmr.shoppingcompose.core.data.remote.repository.impl.ProductRepositoryImpl
import com.ibrahimdmr.shoppingcompose.core.data.remote.source.ProductRemoteDataImpl
import com.ibrahimdmr.shoppingcompose.core.data.remote.source.ProductRemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface ProductModule {
    @Binds
    fun bindProductRemoteDataSource(
        sourceImpl: ProductRemoteDataImpl
    ): ProductRemoteDataSource

    @Binds
    fun bindProductRepository(
        sourceImpl: ProductRepositoryImpl
    ): ProductRepository

}
