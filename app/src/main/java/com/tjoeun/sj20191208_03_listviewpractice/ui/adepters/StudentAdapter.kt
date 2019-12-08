package com.tjoeun.sj20191208_03_listviewpractice.ui.adepters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.tjoeun.sj20191208_03_listviewpractice.R
import com.tjoeun.sj20191208_03_listviewpractice.ui.datas.User

class StudentAdapter(context:Context, resId:Int, list:ArrayList<User>):ArrayAdapter<User>(context,resId,list){
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        Log.d("getView 실행", "${position}번 줄 그리기")

        var tempRow = convertView
        if (tempRow==null){

            Log.d("새로 뷰 그리기", "inflate 실행됨")

            tempRow = inf.inflate(R.layout.user_list_item, null)

        }
        var row = tempRow!!

        val data = mList.get(position)
        val studentNameTxt = row.findViewById<TextView>(R.id.studentNameTxt)
        val studentAddressTxt = row.findViewById<TextView>(R.id.userAddressTxt)
        studentNameTxt.text= data.name
        studentAddressTxt.text= data.address

        return row
    }

}