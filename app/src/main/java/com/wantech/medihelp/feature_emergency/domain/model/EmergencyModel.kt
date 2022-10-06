package com.wantech.medihelp.feature_emergency.domain.model

data class EmergencyModel(
    val emergencyType: String,
    val image: Int,
    var isSelected: Boolean = false

)
