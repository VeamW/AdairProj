package com.adair.work.kotlin

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.jetbrains.anko.find

/**
 * Created by AdairWong on 2016/11/21.
 */
class KotlinAdapter(var context: Activity, var data: List<String>) : BaseAdapter() {


    override fun getItem(position: Int): Any {
        return data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var v: View
        var holder: ViewHolder

        if (convertView == null) {
            v = context.layoutInflater.inflate(R.layout.item_relative, null)
            holder = ViewHolder(v)
            v.tag = holder

        } else {
            v = convertView
            holder = v.tag as ViewHolder
        }

        holder.str.text = getItem(position).toString()

        return v
    }


    class ViewHolder(var itemView: View) {
        var str: TextView = itemView.find(R.id.txv_item)
    }


}