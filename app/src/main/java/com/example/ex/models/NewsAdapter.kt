package com.example.ex.models

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ex.NewsFragment
import com.example.ex.R
import com.example.ex.detailsFragment

class NewsAdapter (
    private val array: ArrayList<data>,
    private val context: FragmentActivity
) : RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val text: TextView = view.findViewById(R.id.tvName)
        val text2: TextView = view.findViewById(R.id.discription)
        val image: ImageView = view.findViewById(R.id.image1)
        val constraintLayout: ConstraintLayout = view.findViewById(R.id.cl)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = array[position]
        holder.text.text = item.name
        holder.text2.text = item.discription
        holder.text2.setTextColor(ContextCompat.getColor(context,item.bColor))
        holder.constraintLayout.setBackgroundResource(item.color)


        holder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putSerializable("item", item)
            context.supportFragmentManager.beginTransaction()
                .replace(R.id.container, detailsFragment::class.java, bundle)
                .addToBackStack(null).commit()
        }
        Glide.with(holder.itemView)
            .load(item.image)
            .into(holder.image)


    }

    override fun getItemCount(): Int {
        return array.size
    }

}
