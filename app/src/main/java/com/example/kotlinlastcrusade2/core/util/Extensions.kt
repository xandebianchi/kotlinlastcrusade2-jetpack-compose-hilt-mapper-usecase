package com.example.kotlinlastcrusade2.core.util

import com.example.kotlinlastcrusade2.BuildConfig

fun String?.toPostUrl() = "${BuildConfig.BASE_URL_IMAGE}$this"

fun String?.toBackdropUrl() = "${BuildConfig.BASE_URL_IMAGE}$this"
