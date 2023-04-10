package com.example.custombottomnavigationview.curvedbottomnavigation

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.annotation.NavigationRes
import androidx.annotation.StringRes

/**
 * Created by suson on 10/1/20
 */
data class CbnMenuItem(
    @DrawableRes
    val icon: Int,
    @DrawableRes
    val avdIcon: Int,
    @IdRes
    val destinationId: Int = -1,
    val title:String
)