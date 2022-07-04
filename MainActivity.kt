package com.govind8061.homeworkouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.govind8061.homeworkouts.adapters.WorkoutSliderAdapter
import com.govind8061.homeworkouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        supportActionBar?.hide()

        val myList: List<String> = mutableListOf("a","b","c")
        val adapter=WorkoutSliderAdapter(myList)
        binding?.vpExerciseFragments?.adapter=adapter
        binding?.vpExerciseFragments?.orientation=ViewPager2.ORIENTATION_HORIZONTAL

    }

    override fun onDestroy() {
        super.onDestroy()
        if (binding!=null){
            binding=null
        }
    }
}