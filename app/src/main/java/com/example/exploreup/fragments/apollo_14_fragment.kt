package com.example.exploreup.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.exploreup.R
import com.example.exploreup.databinding.FragmentApollo11FragmentBinding
import com.example.exploreup.databinding.FragmentApollo12FragmentBinding
import com.example.exploreup.databinding.FragmentApollo14FragmentBinding


class apollo_14_fragment : Fragment() {

    lateinit var binding: FragmentApollo14FragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentApollo14FragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mtxt2.text = "\tThe Apollo 14 mission successfully landed in the Fra Mauro region of the Moon. Astronauts deployed a sophisticated long-lived geophysical station. While on the surface they performed active seismic and magnetic experiments, deployed a solar wind collector and laser reflector, made an extensive geologic traverse, and performed television, movie, and still camera photography and other minor tasks.\n" +
                "\tSince initial activation of the Apollo 14 PSE, all elements operated as planned with two exceptions. The LPZ seismometer was unstable in the flat-response mode from deployment until November 17, 1976, when the problem was rectified. The Y-axis of the gimbals leveling system responded to commands only intermittently.\n" +
                "\tThe Apollo 14 ALSEP suffered several periods of loss of signal (LOS), and because there was no data storage capability in the PSE, these periods represent total data loss. The cause for the LOS is unknown. Periods of LOS are listed in below table. The periods listed do not include short intervals, when higher priorities or receiving station technical problems prevented reception of data from the ALSEP\n" +
                "\tExplosion seismic refraction data indicate that the lunar near-surface rocks at the Apollo 14 site consist of a regolith 8.5 meters thick and characterized by a compressional wave velocity of 104 meters per second. The regolith is underlain by a layer with a compressional wave velocity of 299 meters per second. The thickness of this layer, which we interpret to be the Fra Mauro Formation, is between 16 and 76 meters. The layer immediately beneath this has a velocity greater than 370 meters per second. We found no evidence of permafrost.\n"

   binding.apollo14.setOnClickListener {
       findNavController().navigate(R.id.action_apollo_14_fragment_to_apollo14WebVIew)

   }

    }


}