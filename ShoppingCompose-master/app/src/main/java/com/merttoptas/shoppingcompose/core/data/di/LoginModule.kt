package com.ibrahimdmr.shoppingcompose.core.data.di

import com.ibrahimdmr.shoppingcompose.core.data.remote.repository.AuthRepository
import com.ibrahimdmr.shoppingcompose.core.data.remote.repository.impl.AuthRepositoryImpl
import com.ibrahimdmr.shoppingcompose.core.data.remote.source.AuthRemoteDataSource
import com.ibrahimdmr.shoppingcompose.core.data.remote.source.AuthRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface LoginModule {
    @Binds
    fun bindLoginRemoteDataSource(
        sourceImpl: AuthRemoteDataSourceImpl
    ): AuthRemoteDataSource

    @Binds
    fun bindLoginRepository(
        repositoryImpl: AuthRepositoryImpl
    ): AuthRepository
}
