package com.prodevjohn.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val nameResourceId: Int,
    val numberOfCourses: Int,
    @DrawableRes val imageResourceId: Int
)
