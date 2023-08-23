package com.abanoub.kmmexample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform