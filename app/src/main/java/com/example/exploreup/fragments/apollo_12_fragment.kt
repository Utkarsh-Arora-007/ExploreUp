package com.example.exploreup.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.exploreup.R
import com.example.exploreup.databinding.FragmentApollo11FragmentBinding
import com.example.exploreup.databinding.FragmentApollo12FragmentBinding


class apollo_12_fragment : Fragment() {

    lateinit var binding: FragmentApollo12FragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentApollo12FragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mtxt1.text = "\tThe primary objective of the experiment was to use these data to determine the internal structure, physical state, and tectonic activity of the Moon. The secondary objectives were to determine the number and mass of meteoroids that strike the Moon and record tidal deformations of the lunar surface.\n" +
                "\tSeismic signals from 208 natural events and from two man-made impacts have been recorded during the first 8 months of operation of the Apollo 12 seismic station. The natural seismic events are of internal origin (moonquakes) and external origin (meteoroid impacts).\n" +
                "\tWith few exceptions, moonquakes occur at monthly intervals near times of perigee. Thus, they appear to be induced by tidal stress. From the uniform polarity of the signals, the presence of tectonic strain within the outer shell of the moon is inferred.\n" +
                "\tThe moonquakes can be separated into ten sets of matching signals, implying the presence of at least ten active zones in the region of the Apollo 12 station. All of the moonquakes are small (less than magnitude 2 on the Richter scale).\n" +
                "\tThe low level of detectable seismic activity, the presence of mascons, and the lack of visual evidence of relative lateral movement of lunar surface blocks, suggests that the outer shell of the moon is quite rigid and tectonically stable compared to the earth.\n"
    }

}