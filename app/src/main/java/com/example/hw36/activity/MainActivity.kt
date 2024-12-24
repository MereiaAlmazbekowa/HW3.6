package com.example.hw36.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private val phoneNumber = "+996999792479"
    private val whatsAppNumber = "+996999792479"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


       /* binding.btnCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$phoneNumber")
            startActivity(intent)
        }

        binding.btnWhatsapp.setOnClickListener {
            val url = "https://api.whatsapp.com/send?phone=$whatsAppNumber"
            val intent = Intent(Intent.ACTION_VIEW).apply {
                this.data = Uri.parse(url)
            }
            startActivity(intent)
        }*/
    }
}