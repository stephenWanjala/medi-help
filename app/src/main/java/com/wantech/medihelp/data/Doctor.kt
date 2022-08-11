package com.wantech.medihelp.data


data class Doctor(
    val doctorName: String,
    val specialization: DoctorSpecialization,
    val location: String,
    val mobileContact: String,
    val hospitalAttendsTo:Hospital?=null,
    val rating: Float = 0f,
    val totalPatients: Int = 0,
    val yearsOfExperience: Int = 0,
    val timeAvailable: String
)
