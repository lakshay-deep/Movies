package com.lakshay.movies.di

import com.lakshay.movies.util.provideDispatcher
import org.koin.dsl.module

private val utilityModule = module {
    factory { provideDispatcher() }
}



private val SharedModule = listOf(utilityModule)

fun  getSharedModule() = SharedModule