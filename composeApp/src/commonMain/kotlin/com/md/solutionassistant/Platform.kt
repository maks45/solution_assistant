package com.md.solutionassistant

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform