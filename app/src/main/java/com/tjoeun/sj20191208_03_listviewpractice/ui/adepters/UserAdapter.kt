package com.tjoeun.sj20191208_03_listviewpractice.ui.adepters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.tjoeun.sj20191208_03_listviewpractice.R
import com.tjoeun.sj20191208_03_listviewpractice.ui.datas.User

class UserAdapter(context:Context,resId:Int,list: ArrayList<User>):ArrayAdapter<User>(context, resId, list){
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow==null){
            tempRow = inf.inflate(R.layout.user_list_item, null)

        }
        val row = tempRow!!
//        상황에 맞는 user_list_itme에 뿌려주기

        return row
    }


}