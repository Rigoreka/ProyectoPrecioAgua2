package com.example.proyectoprecioagua

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class Adaptador (context: Context, val valores:List<mes>): ArrayAdapter<mes>(context,0,valores){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view=convertView
        if (view==null)
            view= LayoutInflater.from(context).inflate(android.R.layout.simple_expandable_list_item_2,parent,false)

        val meses=valores[position]

        view!!.findViewById<TextView>(android.R.id.text1).setText(meses.mes)

        return view
    }

}