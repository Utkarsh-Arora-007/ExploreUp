package com.example.exploreup.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.exploreup.MainActivity
import com.example.exploreup.R
import com.example.exploreup.data.MyDataClass
import com.example.exploreup.fragments.apollo_11_fragment

class MyAdapter(private val mList: List<MyDataClass>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rec_view_item, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        holder.textView.text = ItemsViewModel.name

        when(ItemsViewModel.name){
            "Apollo 11"->{
                holder.itemView.setOnClickListener {
                    it.findNavController().navigate(R.id.action_apollo_missions_fragment_to_apollo_11_fragment)
                }
            }
            "Apollo 12"->{
                holder.itemView.setOnClickListener {
                    it.findNavController().navigate(R.id.action_apollo_missions_fragment_to_apollo_12_fragment)
                }
            }

            "Apollo 14"->{
                holder.itemView.setOnClickListener {
                    it.findNavController().navigate(R.id.action_apollo_missions_fragment_to_apollo_14_fragment)
                }
            }

            "Apollo 15"->{
                holder.itemView.setOnClickListener {
                    it.findNavController().navigate(R.id.action_apollo_missions_fragment_to_apollo_15_fragment)
                }
            }

            "Apollo 16"->{
                holder.itemView.setOnClickListener {
                    it.findNavController().navigate(R.id.action_apollo_missions_fragment_to_apollo_16_fragment)
                }     }
            "Apollo 17"->{

                holder.itemView.setOnClickListener {
                    it.findNavController().navigate(R.id.action_apollo_missions_fragment_to_apollo_17_fragment)
                }
            }

        }

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val textView: TextView = itemView.findViewById(R.id.recText)
    }
}