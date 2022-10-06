package com.wantech.medihelp.feature_ambulance.domain.model

data class Ambulance(
    val ambulanceName:String,
    val serviceType:String,
    val location:String,
    val estimateReachTime:Float
)
