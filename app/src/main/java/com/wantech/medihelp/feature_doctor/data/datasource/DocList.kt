package com.wantech.medihelp.feature_doctor.data.datasource

import com.wantech.medihelp.R
import com.wantech.medihelp.feature_doctor.domain.util.DoctorSpecialistsGroup
import com.wantech.medihelp.feature_doctor.domain.util.DoctorSpecialization
import com.wantech.medihelp.feature_doctor.domain.model.Doctor

object DocList {
    val listOfDoctorSpecialistsGroups: ArrayList<DoctorSpecialistsGroup> = arrayListOf(
        DoctorSpecialistsGroup("medical specialist", R.drawable.ic_doctor),
        DoctorSpecialistsGroup("Dental Specialist", R.drawable.ic_medicine_),
        DoctorSpecialistsGroup("Liver Specialist", R.drawable.ic_medical_care_movn),
        DoctorSpecialistsGroup("Dental Specialist", R.drawable.ic_medicine_),
        DoctorSpecialistsGroup("Liver Specialist", R.drawable.ic_medical_care_movn)
    )

    val listOfDoctors = arrayListOf(
        Doctor(
            "John doe",
            DoctorSpecialization.MEDICAL_SPECIALIZATION,
            "Caren,Nairobi",
            "+25471223445689",
            null,
            4.5f,
            400,
            9,
            "8:00Am -8:00Pm",
            R.drawable.ic_doctor
        ),
         Doctor(
            "John doe",
             DoctorSpecialization.MEDICAL_SPECIALIZATION,
            "Caren,Nairobi",
            "+25471223445689",
            null,
            4.5f,
            400,
            9,
            "8:00Am -8:00Pm",
            R.drawable.ic_doctor
        ),
         Doctor(
            "John doe",
             DoctorSpecialization.Dermatologists,
            "Caren,Nairobi",
            "+25471223445689",
            null,
            4.5f,
            400,
            9,
            "8:00Am -8:00Pm",
            R.drawable.ic_doctor
        ),
         Doctor(
            "John doe",
             DoctorSpecialization.MEDICAL_SPECIALIZATION,
            "Caren,Nairobi",
            "+25471223445689",
            null,
            4.5f,
            400,
            9,
            "8:00Am -8:00Pm",
            R.drawable.ic_doctor
        ),
         Doctor(
            "John doe",
             DoctorSpecialization.CYNAECOLOGIST_SPECIALIST,
            "Caren,Nairobi",
            "+25471223445689",
            null,
            4.5f,
            400,
            9,
            "8:00Am -8:00Pm",
            R.drawable.ic_doctor
        ),

    )
}