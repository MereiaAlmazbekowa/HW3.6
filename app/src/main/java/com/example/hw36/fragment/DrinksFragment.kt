package com.example.hw36.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.hw36.R
import com.example.hw36.databinding.ActivityMainBinding
import com.example.hw36.databinding.FragmentDrinksBinding


class DrinksFragment : Fragment() {
    private lateinit var binding: FragmentDrinksBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }
}
