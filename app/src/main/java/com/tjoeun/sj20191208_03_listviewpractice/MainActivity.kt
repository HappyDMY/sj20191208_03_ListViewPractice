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

        val tempUser = User("계석준","서울시도봉구", false)
        Log.d("사용자 주소", tempUser.address)


    }
}
