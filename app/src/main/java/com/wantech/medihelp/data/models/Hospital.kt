package com.wantech.medihelp.data.models

import com.wantech.medihelp.R

data class Hospital(
    val hospitalId: String,
    val hospitalName: String,
    val hospitalLocation: String,
    val hospitalType: String,
    val contactHotLine:String,
    val samplePicturesInt: Int
)
