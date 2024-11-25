package com.example.activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.activities.adapters.ActivityAdapter
import com.example.activities.models.ActivityItem


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ActivityAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val activities = listOf(
            ActivityItem(
                R.drawable.a1,
                "Deep Sea Diving",
                "4.5/5",
                "Present",
                "Yes",
                "Price: $30"

            ),
            ActivityItem(
                R.drawable.a2,
                " Surfing & Diving",
                "4.5/5",
                "Present",
                "Yes",
                "Price: $300"

            ),
            ActivityItem(
                R.drawable.a3,
                " Kayaking",
                "4.2/5",
                "Present",
                "Yes",
                "Price: $350"

            ),
            ActivityItem(
                R.drawable.a4,
                "Paragliding",
                "4.0/5",
                "Present",
                "No",
                "Price: $500"

            ),
            // Add more items as needed
        )

        recyclerView = findViewById(R.id.activities_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ActivityAdapter(activities)
        recyclerView.adapter = adapter
    }
}