package com.tjoeun.sj20191208_03_listviewpractice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tjoeun.sj20191208_03_listviewpractice.ui.adepters.StudentAdapter
import com.tjoeun.sj20191208_03_listviewpractice.ui.adepters.UserAdapter
import com.tjoeun.sj20191208_03_listviewpractice.ui.datas.User
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val studentList = ArrayList<User>()
    var userAdapter:UserAdapter?=null

    val secondStudentList = ArrayList<User>()
    var studentAdapter:StudentAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        학생목록 추가
        addStudents()
        addSecondStudents()

        userAdapter = UserAdapter(this, R.layout.user_list_item, studentList)
        userListView.adapter = userAdapter


        studentAdapter = StudentAdapter(this, R.layout.user_list_item, secondStudentList)
        secondListView.adapter = studentAdapter

    }
    fun addStudents(){
        studentList.add(User("나","서울시 도봉구 ",  false))
        studentList.add(User("1","서울시 관악구 ",  true))
        studentList.add(User("2","서울시 광진구 ",  false))
        studentList.add(User("3","서울시 서대문구 ",  false))
        studentList.add(User("4","서울시 블라블라",  false))
        studentList.add(User("5","서울시 도봉구 ",  false))
    }

    fun addSecondStudents(){
        secondStudentList.add(User("s18","서울시 도봉구 ",  false))
        secondStudentList.add(User("s17","서울시 도봉구 ",  false))
        secondStudentList.add(User("s16","서울시 도봉구 ",  false))
        secondStudentList.add(User("s15","서울시 도봉구 ",  false))
        secondStudentList.add(User("s14","서울시 도봉구 ",  false))
        secondStudentList.add(User("s13","서울시 도봉구 ",  false))
        secondStudentList.add(User("s12","서울시 도봉구 ",  false))
        secondStudentList.add(User("s11","서울시 도봉구 ",  false))
        secondStudentList.add(User("s10","서울시 도봉구 ",  false))
        secondStudentList.add(User("s9","서울시 도봉구 ",  false))
        secondStudentList.add(User("s8","서울시 도봉구 ",  false))
        secondStudentList.add(User("s7","서울시 도봉구 ",  false))
        secondStudentList.add(User("s6","서울시 도봉구 ",  false))
        secondStudentList.add(User("s5","서울시 도봉구 ",  false))
        secondStudentList.add(User("s4","서울시 블라블라",  false))
        secondStudentList.add(User("s3","서울시 서대문구 ",  false))
        secondStudentList.add(User("s2","서울시 광진구 ",  false))
        secondStudentList.add(User("s1","서울시 관악구 ",  true))
        secondStudentList.add(User("나","서울시 도봉구 ",  false))
    }


//        val tempUser = User("계석준","서울시도봉구", false)
//        Log.d("사용자 주소", tempUser.address)
//
//        val tempUser2 = User()
//        Log.d("사용자 주소", tempUser2.address)
//
//        val tempUser3 = User()
//        Log.d("사용자주소", "아이유")
}
