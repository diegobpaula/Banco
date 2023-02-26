package com.diegobpaula.banco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diegobpaula.banco.databinding.ActivityFaturasBinding

class Faturas : AppCompatActivity() {

    private lateinit var  binding: ActivityFaturasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFaturasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        val toolbar = binding.toolbarFaturas
        toolbar.title = "Fatura"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(320,0, 360,0)
        toolbar.setBackgroundColor(getColor(R.color.lite_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_back))
        toolbar.setNavigationOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}