package com.shruti.chatapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter(var item : ArrayList<Chatdataclass>,var chatInterface: ChatInterface) : RecyclerView.Adapter<ChatAdapter.ViewHolder>() {
     class ViewHolder(var view : View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_me_view,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return item.size
    }
}