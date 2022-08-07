package com.wantech.medihelp.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wantech.medihelp.R
import de.hdodenhof.circleimageview.CircleImageView

class SpecialistAdapter(
    private val listOfTempSpecialist: ArrayList<DoctorSpecialist>
) : RecyclerView.Adapter<SpecialistAdapter.SpecialistViewHOlder>() {

    inner class SpecialistViewHOlder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView:CircleImageView=itemView.findViewById(R.id.docImageSpec)
        val descriptionTextView: TextView = itemView.findViewById(R.id.textSpec)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpecialistViewHOlder {
        return SpecialistViewHOlder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.doctor_type_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SpecialistViewHOlder, position: Int) {
        holder.apply {
            imageView.setImageResource(listOfTempSpecialist[position].specImage)
            descriptionTextView.text = listOfTempSpecialist[position].specialisation
        }
    }

    override fun getItemCount(): Int = listOfTempSpecialist.size
}