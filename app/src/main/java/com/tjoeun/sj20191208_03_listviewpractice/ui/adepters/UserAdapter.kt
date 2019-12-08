package com.tjoeun.sj20191208_03_listviewpractice.ui.adepters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
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

//        리스트에서 각 줄에 맞는 근거 데이터 뽑아오기
//        position 변수가 몇번째 줄을 출력하려 하는지 알려주는 역할

        val data = mList.get(position)

        val userNameTxt = row.findViewById<TextView>(R.id.userNameTxt)
        val userAddressTxt = row.findViewById<TextView>(R.id.userAddressTxt)
        val userGenderTxt = row.findViewById<TextView>(R.id.userGenderTxt)

        userNameTxt.text = data.name
        userAddressTxt.text = "${data.address}"
        if (data.isWomen){
            userGenderTxt.text = "여성"
        }else{
            userGenderTxt.text = "남성"

        }

        return row
    }


}