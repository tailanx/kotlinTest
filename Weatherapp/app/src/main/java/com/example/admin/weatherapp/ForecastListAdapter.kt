package com.example.admin.weatherapp

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by admin on 2016/2/19.
 */
class ForecastListAdapter(val items: List<String>) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>(){
    override fun getItemCount(): Int  = items.size;

    override fun onBindViewHolder(viewHolder: ForecastListAdapter.ViewHolder, p1: Int) {
        viewHolder.textView.text = items.get(p1);
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ForecastListAdapter.ViewHolder {
        return ViewHolder(TextView(p0.context))
    }

    class ViewHolder(val textView : TextView) :RecyclerView.ViewHolder(textView);

}
