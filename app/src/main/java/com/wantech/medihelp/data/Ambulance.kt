package com.wantech.medihelp.data

import android.util.TimeUtils

data class Ambulance(
    val ambulanceName:String,
    val serviceType:String,
    val location:String,
    val estimateReachTime:Float
)
