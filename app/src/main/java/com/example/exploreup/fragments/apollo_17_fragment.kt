package com.example.exploreup.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.exploreup.R
import com.example.exploreup.databinding.FragmentApollo15FragmentBinding
import com.example.exploreup.databinding.FragmentApollo16FragmentBinding
import com.example.exploreup.databinding.FragmentApollo17FragmentBinding


class apollo_17_fragment : Fragment() {

    lateinit var binding: FragmentApollo17FragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentApollo17FragmentBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mtxt5.text ="\tprimary objective was to constrain the near-surface velocity structure at the landing site using active sources detected by a 100 m-wide triangular geophone array. The experiment was later operated in \"listening mode,\" and early studies of these data revealed the presence of thermal moonquakes - short-duration seismic events associated with terminator crossings.\n" +
                "\tA total of 49,635 detections were made. Of these, 2249 (4.5%) are termed “impulsive”, 13,355 (26.9%) are “intermediate”, and 34,031 (68.5%) are “emergent.” These terms describe the seismic event risetime, where impulsive events reach their maximum energy quickly, emergent events take a longer time, and intermediate events are somewhere in between\n" +
                "\tDeep moonquakes were not evident in Apollo 17 LSPE data, but numerous other events were found. Many of the LSPE events looked like the short period only events that are mentioned in PSELPEC. While the short period only events are not well documented in PSELPEC, they are known to exist and be a mix of meteorite impacts and thermal events.\n" +
                "\tThe experiments showed that the seismic velocity (P wave) is between 0.1 and 0.3 kilometers per second in the upper few hundred meters of the crust at all three landing sites. These velocities are much lower than observed for intact rock on Earth, but are consistent with a highly fractured or brecciated material produced by the prolonged meteoritic bombardment of the Moon. At the Apollo 17 landing site, the surface basalt layer was determined to have a thickness of 1.4 kilometers, slightly higher than the 1 kilometer thickness determined from the Traverse Gravimeter Experiment.\n"
    }


}