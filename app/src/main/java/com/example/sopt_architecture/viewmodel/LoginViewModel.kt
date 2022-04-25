package com.example.sopt_architecture.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sopt_architecture.repository.LoginRepository
import kotlinx.coroutines.launch

class LoginViewModel() : ViewModel() {
    private val repository : LoginRepository = LoginRepository()

    //LiveData는 수명주기를 인식, Repository에서 변경된 데이터를 감지
    private var _userId = MutableLiveData<String>() //private -> 외부에서 접근 금지, var -> 변경가능
    private var _userPassword = MutableLiveData<String>()

    //public-> 외부에서 접근가능, val-> 변경 불가능(userId, _userId 접근 받식만 상이하고 값은 같음)
    val userId : LiveData<String> get() = _userId
    val userPassword : LiveData<String> get() = _userPassword

    init{
        viewModelScope.launch {
            repository.signInData(_userId, _userPassword)
        }
    }


}