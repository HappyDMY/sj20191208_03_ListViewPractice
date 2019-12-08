package com.tjoeun.sj20191208_03_listviewpractice.ui.datas

import android.util.Log

class User (inputName:String, inputAddres:String, isWomenOk:Boolean){
    var name = inputName
    var address = inputAddres
    var isWomen = isWomenOk

    init {
        //추가행동 사항
        Log.d("생성자 호출", inputName)
    }

    constructor() : this("미정", "거주지 불명", true)
    constructor(name:String) : this(name, "거주지만 모름", true)

    fun printUserInfo(){
        Log.d("사용자 정보","이름: ${name}, 거주지: ${address}, 여성인가? ${isWomen}")
    }

}
