package com.example.apitest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(val postModel: PostModel):RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        return holder.bindView(postModel.profiles[position], position + 1)
    }

    override fun getItemCount(): Int {
        return postModel.profiles.size
    }
}


class PostViewHolder(itemView: View): RecyclerView.ViewHolder (itemView) {

    private val tvDiscord: TextView = itemView.findViewById(R.id.tvDiscord)
    private val tvScore: TextView = itemView.findViewById(R.id.tvScore)
    private val tvRank: TextView = itemView.findViewById(R.id.tvRank)

    fun bindView(leaderboardData: LeaderboardData, position : Int) {
        tvDiscord.text = leaderboardData.discord
        tvScore.text = leaderboardData.points.toString()
        tvRank.text = position.toString()
    }
}