package com.example.activities.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.activities.R
import com.example.activities.models.ActivityItem

class ActivityAdapter(private val activities: List<ActivityItem>) :
    RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder>() {

    class ActivityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val beachImage: ImageView = itemView.findViewById(R.id.beach_image)
        val activityTitle: TextView = itemView.findViewById(R.id.activity_title)
        val ratingText: TextView = itemView.findViewById(R.id.rating_text)
        val lifeguardsText: TextView = itemView.findViewById(R.id.lifeguards_text)
        val safetyText: TextView = itemView.findViewById(R.id.safety_text)
        val pricingText: TextView = itemView.findViewById(R.id.pricing_text)
        val bookNowButton: Button = itemView.findViewById(R.id.book_now_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_item, parent, false)
        return ActivityViewHolder(view)
    }

    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
        val currentItem = activities[position]

        holder.beachImage.setImageResource(currentItem.imageResource)
        holder.activityTitle.text = currentItem.title
        holder.ratingText.text = currentItem.rating
        holder.lifeguardsText.text = currentItem.lifeguardStatus
        holder.safetyText.text = currentItem.safetyStatus
        holder.pricingText.text = currentItem.price

        holder.bookNowButton.setOnClickListener {
            // Handle booking action here
        }
    }

    override fun getItemCount() = activities.size
}