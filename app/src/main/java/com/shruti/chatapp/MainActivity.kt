package com.shruti.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),dialogClickInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun fabClick(){

    }
    fun addComment(chatEnumClass: ChatEnumClass){
        when(chatEnumClass){
            ChatEnumClass.dialogClick ->{
                var dialogClassAdapter : DialogAdapter
               dialogClassAdapter.dialogClickInterface= this
                dialogClassAdapter.show(supportFragmentManager,DialogAdapter.TAG)
            }
            else-> {}

        }
    }

    override fun dialogName(name: String) {

    }
}