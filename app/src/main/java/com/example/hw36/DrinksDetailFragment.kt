package com.example.hw36

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw36.databinding.FragmentDrinksDetailBinding


class DrinksDetailFragment : Fragment() {

    private val binding by lazy {
        FragmentDrinksDetailBinding.inflate(layoutInflater)
    }

    private val phoneNumber = "+996999792479"
    private val whatsAppNumber = "+996999792479"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$phoneNumber")
            startActivity(intent)

            binding.btnOrder.setOnClickListener {
                val url = "https://api.whatsapp.com/send?phone=$whatsAppNumber"
                val intent = Intent(Intent.ACTION_VIEW).apply {
                    this.data = Uri.parse(url)
                }
                startActivity(intent)
            }
        }
    }

}