package com.example.exploreup.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.exploreup.R
import com.example.exploreup.databinding.FragmentApollo14FragmentBinding
import com.example.exploreup.databinding.FragmentApollo15FragmentBinding


class apollo_15_fragment : Fragment() {
    lateinit var binding: FragmentApollo15FragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentApollo15FragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mtxt3.text = "\tFour wheels on the Moon. Astronauts David Scott and James Irwin roamed the Hadley-Apennine region of the Moon in a Lunar Roving Vehicle, also known as a \"Moon Buggy.\" They traveled more than 17 miles on the lunar surface and collected 170 pounds (77 kilograms) of lunar rock and soil.\n" +
                "\tApollo 15 was launched on July 26, 1971, and successfully completed the fourth human landing on the Moon. It was the first of the “J series” of Apollo missions, which featured longer stays on the surface and in lunar orbit and more extensive science operations than was possible on the earlier Apollo missions.\n" +
                "\tMeteoroid impacts cause heavy fracturing in the upper 20 kilometers of the lunar crust. These fractures in turn cause scattering of seismic waves in these regions. Below 20 kilometers, seismic-wave scattering decreases as a result of either closure of these fractures due to increasing pressure or of a change in chemical composition of the crust. In the mantle, seismic waves are attenuated much less on the Moon than they are on Earth\n" +
                "\tMore than 1700 meteoroid impacts were recorded by the seismometer network, with impactor masses estimated to be between 0.5 and 5000 kilograms. Most moonquakes occur at depths of 800-1000 kilometers. These occur at monthly intervals at about 100 distinct sites, indicating that these moonquakes are caused by stresses from changes in lunar tides as the Moon orbits the Earth.\n"
    }

}