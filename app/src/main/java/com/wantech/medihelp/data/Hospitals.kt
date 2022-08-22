package com.wantech.medihelp.data

import com.wantech.medihelp.R
import com.wantech.medihelp.data.models.Hospital

object Hospitals {
    val hospitals = arrayListOf<Hospital>(
        Hospital(
            "BDH",
            "Bungoma District Hospital",
            "Bungoma",
            "Public",
            "+254070707",
            R.drawable.ic_doctor
        ),
        Hospital(
            "BW",
            "Bungoma West",
            "Bungoma",
            "private",
            "+254070707",
            R.drawable.ic_doctor
        ),
        Hospital(
            "KUNH",
            "Kenyatta University National Hospital",
            "Nairobi",
            "Public",
            "+254070707",
            R.drawable.ic_doctor
        ),
        Hospital(
            "MTRH",
            "Moi Teaching referral Hospital",
            "Eldoret",
            "Public",
            "+254070707",
            R.drawable.ic_doctor
        ),
        Hospital(
            "SD",
            "St Domiano",
            "Bungoma",
            "Private",
            "+2540707830",
            R.drawable.ic_doctor
        ),
    )
}