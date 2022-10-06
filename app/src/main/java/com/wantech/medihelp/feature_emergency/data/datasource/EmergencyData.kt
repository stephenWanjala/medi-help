package com.wantech.medihelp.feature_emergency.data.datasource

import com.wantech.medihelp.R
import com.wantech.medihelp.feature_emergency.domain.model.EmergencyModel

object EmergencyData {
    val emergencyList= arrayListOf<EmergencyModel>(
        EmergencyModel("Hospital", R.drawable.ic_medicine_,true),
        EmergencyModel("Ambulance",R.drawable.ambulance),
        EmergencyModel("Doctor",R.drawable.ic_doctor),
        EmergencyModel("healthCare",R.drawable.ic_health_care)
    )
}