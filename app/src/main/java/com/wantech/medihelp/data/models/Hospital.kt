package com.wantech.medihelp.data.models

data class Hospital(
    val hospitalId: String,
    val hospitalName: String,
    val hospitalLocation: String,
    val hospitalType: String,
    val contactHotLine:String,
    val samplePictures:ArrayList<Int> = ArrayList()
)
