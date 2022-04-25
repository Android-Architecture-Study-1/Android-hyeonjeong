package com.example.sopt_architecture.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.sopt_architecture.R
import com.example.sopt_architecture.databinding.ActivityLoginBinding
import com.example.sopt_architecture.model.UserData
import com.example.sopt_architecture.viewmodel.LoginViewModel
import java.util.Observer

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login) //바인딩 세팅
        binding = ActivityLoginBinding.inflate(layoutInflater)
        binding.login = LoginViewModel() //레이아웃 변수 할당

        val model: LoginViewModel by viewModels()

        model.userId.observe(this) { it ->
            
        }

    }
}