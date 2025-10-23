package com.example.loginapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val nama = binding.etNama.text.toString()
            val username = binding.etUsername.text.toString()
            val email = binding.etEmail.text.toString()
            val kelamin = when (binding.rgKelamin.checkedRadioButtonId) {
                binding.rbLaki.id -> "Laki-laki"
                binding.rbPerempuan.id -> "Perempuan"
                else -> ""
            }
            val password = binding.etPassword.text.toString()
            val confirmPassword = binding.etConfirmPassword.text.toString()

            if (nama.isBlank() || username.isBlank() || email.isBlank() || kelamin.isBlank()
                || password.isBlank() || confirmPassword.isBlank()) {
                Toast.makeText(this, "Semua field harus diisi", Toast.LENGTH_SHORT).show()
            } else if (password != confirmPassword) {
                Toast.makeText(this, "Password tidak cocok", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login berhasil!", Toast.LENGTH_SHORT).show()
                // Lanjutkan ke halaman berikutnya atau simpan data
            }
        }
    }
}
