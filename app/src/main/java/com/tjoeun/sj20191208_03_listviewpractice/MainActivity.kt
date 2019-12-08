package com.tjoeun.sj20191208_03_listviewpractice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tjoeun.sj20191208_03_listviewpractice.ui.datas.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val tempUser = User("계석준","서울시도봉구", false)
//        Log.d("사용자 주소", tempUser.address)
//
//        val tempUser2 = User()
//        Log.d("사용자 주소", tempUser2.address)
//
//        val tempUser3 = User()
//        Log.d("사용자주소", "아이유")


        val studentList = ArrayList<User>()
        fun addStudents(){
            studentList.add(User("나","서울시 도봉구 ",  false))
            studentList.add(User("1","서울시 관악구 ",  true))
            studentList.add(User("2","서울시 광진구 ",  false))
            studentList.add(User("3","서울시 서대문구 ",  false))
            studentList.add(User("4","서울시 블라블라",  false))
            studentList.add(User("5","서울시 도봉구 ",  false))
        }

    }
}
