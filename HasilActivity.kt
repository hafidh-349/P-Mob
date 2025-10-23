package com.example.loginapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp.databinding.ActivityHasilBinding

class HasilActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHasilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHasilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra("nama")
        val username = intent.getStringExtra("username")
        val email = intent.getStringExtra("email")
        val kelamin = intent.getStringExtra("kelamin")
        val password = intent.getStringExtra("password")

        binding.tvNama.text = "Nama: $nama"
        binding.tvUsername.text = "Username: $username"
        binding.tvEmail.text = "Email: $email"
        binding.tvKelamin.text = "Kelamin: $kelamin"
        binding.tvPassword.text = "Password: $password"
    }
}
