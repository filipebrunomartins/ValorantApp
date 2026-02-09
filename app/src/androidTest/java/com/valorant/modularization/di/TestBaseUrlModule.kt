package com.valorant.modularization.di

import com.valorant.di.qualifier.AppBaseUrl
import com.valorant.modularization.BaseUrlModule
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Singleton

//@Module
//@TestInstallIn(
//    components = [SingletonComponent::class],
//    replaces = [BaseUrlModule::class]
//)
//object TestBaseUrlModule {
//
//    @Provides
//    @AppBaseUrl
//    fun provideBaseUrl(): String {
//        return "https://valorant-api.com/"
//    }
//}