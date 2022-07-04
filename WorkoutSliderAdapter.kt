package com.govind8061.homeworkouts.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.govind8061.homeworkouts.R
import com.govind8061.homeworkouts.databinding.SingleWorkoutRowBinding

class WorkoutSliderAdapter(val workoutList: List<String>): RecyclerView.Adapter<WorkoutSliderAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(SingleWorkoutRowBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return workoutList.size
    }

    class ViewHolder(val binding:SingleWorkoutRowBinding) : RecyclerView.ViewHolder(binding.root) {
    }
}