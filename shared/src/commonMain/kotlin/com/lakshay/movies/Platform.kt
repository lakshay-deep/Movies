package com.lakshay.movies

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform