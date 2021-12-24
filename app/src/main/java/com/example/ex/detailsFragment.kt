package com.example.ex

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.ex.models.data


class detailsFragment : Fragment() {
    lateinit var title: TextView
    lateinit var image: ImageView
    lateinit var desc: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_details, container, false)
        title = view.findViewById(R.id.tvName2)
        image = view.findViewById(R.id.im2)
        desc = view.findViewById(R.id.tvDescr2)
        var res = arguments?.getSerializable("item") as data
        title.text = res.name
        Glide.with(this)
            .load(res.image)
            .into(image)
        desc.text = res.discription
        return view
    }



}