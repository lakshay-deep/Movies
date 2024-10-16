package com.lakshay.movies
import com.lakshay.movies.util.Dispatcher
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

internal class IosDispatcher: Dispatcher {

    override val io: CoroutineDispatcher
        get() = Dispatchers.Default
}
internal actual fun provideDispatcher(): Dispatcher = IosDispatcher()