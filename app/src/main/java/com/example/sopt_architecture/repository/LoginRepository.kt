package com.example.sopt_architecture.repository

import androidx.lifecycle.MutableLiveData
import androidx.room.Database

//repository class는 데이터 CRUD 작업을 해주는 클래스(데이터 변경 감지, 데이터 처리 해줌)
class LoginRepository {
    private val db: Database? = null

    fun signInData(userId : MutableLiveData<String>, userPw : MutableLiveData<String>){

    }
}