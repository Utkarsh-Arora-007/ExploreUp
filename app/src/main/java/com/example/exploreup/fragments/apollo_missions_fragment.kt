package com.example.exploreup.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exploreup.R
import com.example.exploreup.adapter.MyAdapter
import com.example.exploreup.data.MyDataClass
import com.example.exploreup.databinding.FragmentApolloMissionsFragmentBinding


class apollo_missions_fragment : Fragment() {

    lateinit var binding:FragmentApolloMissionsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentApolloMissionsFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // getting the recyclerview by its id
        val recyclerview = binding.myrecview

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(requireContext())

        // ArrayList of class ItemsViewModel
        val data = ArrayList<MyDataClass>()

        data.add(MyDataClass("Apollo 11"))
        data.add(MyDataClass("Apollo 12"))
        data.add(MyDataClass("Apollo 14"))
        data.add(MyDataClass("Apollo 15"))
        data.add(MyDataClass("Apollo 16"))
        data.add(MyDataClass("Apollo 17"))

        val adapter = MyAdapter(data)
        recyclerview.adapter = adapter
    }

}