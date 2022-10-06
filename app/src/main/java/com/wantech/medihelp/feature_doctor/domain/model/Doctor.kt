package com.wantech.medihelp.feature_doctor.domain.model

import com.wantech.medihelp.feature_doctor.domain.util.DoctorSpecialization
import com.wantech.medihelp.feature_search.domain.model.Hospital


data class Doctor(
    val doctorName: String,
    val specialization: DoctorSpecialization,
    val location: String,
    val mobileContact: String,
    val hospitalAttendsTo: Hospital?=null,
    val rating: Float = 0f,
    val totalPatients: Int = 0,
    val yearsOfExperience: Int = 0,
    val timeAvailable: String,
    val personImage:Int?
)
