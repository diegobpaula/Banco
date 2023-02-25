package com.diegobpaula.banco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diegobpaula.banco.databinding.ActivitySaldoBinding

class Saldo : AppCompatActivity() {

    private lateinit var binding: ActivitySaldoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaldoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()

        val toolbar = binding.toolbarSaldo
        toolbar.title = "Saldo"
        toolbar.setTitleTextColor(getColor(R.color.white))
        toolbar.setTitleMargin(320, 0, 360, 0)
        toolbar.setBackgroundColor(getColor(R.color.lite_blue))
        toolbar.setNavigationIcon(getDrawable(R.drawable.ic_back))
        toolbar.setNavigationOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}