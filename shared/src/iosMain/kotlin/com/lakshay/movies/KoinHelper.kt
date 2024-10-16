package com.lakshay.movies

import com.lakshay.movies.di.getSharedModule
import org.koin.core.context.startKoin

fun initKoin() {
    startKoin{
        modules(getSharedModule())
    }
}