package com.example.gmailapplication

import Email
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val emailList = arrayListOf(
            Email("Alice Johnson", "Meeting rescheduled to tomorrow at 3 PM.", "8:30 AM", R.drawable.avatar),
            Email("Finance Team", "Monthly report and budget overview for Q4.", "9:15 AM", R.drawable.avatar),
            Email("Bob Carter", "Can you review the attached document by EOD?", "10:45 AM", R.drawable.avatar),
            Email("HR Department", "Reminder: Complete your annual training by next week.", "11:20 AM", R.drawable.avatar),
            Email("Emily White", "Project updates: Key points from the last meeting.", "12:05 PM", R.drawable.avatar),
            Email("System Admin", "Scheduled maintenance notice for October 31st.", "1:30 PM", R.drawable.avatar),
            Email("Support", "Re: Your ticket #45632 has been updated.", "2:10 PM", R.drawable.avatar),
            Email("Marketing Team", "Launch plan for new product next month.", "3:45 PM", R.drawable.avatar),
            Email("IT Security", "Important: Password reset required within 48 hours.", "4:20 PM", R.drawable.avatar),
            Email("Sarah Lee", "Meeting minutes from today's discussion.", "5:15 PM", R.drawable.avatar)
        )


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emailList)
    }
}