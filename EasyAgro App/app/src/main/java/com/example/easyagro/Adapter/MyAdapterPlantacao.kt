package com.example.easyagro.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.easyagro.Models.Model
import com.example.easyagro.R

class MyAdapterPlantacao(var mCtx: Context, var resources: Int, var items: List<Model>) :
    ArrayAdapter<Model>(mCtx, resources, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view: View = layoutInflater.inflate(resources, null)

        val imageView: ImageView = view.findViewById(R.id.plantacaoa)
        val titleTextView: TextView = view.findViewById(R.id.textViewPlantacao1)
        val descriptionTextView: TextView = view.findViewById(R.id.textViewPlantacao2)

        var mItem: Model = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        titleTextView.text = mItem.title
        descriptionTextView.text = mItem.description

        return view
    }
}
