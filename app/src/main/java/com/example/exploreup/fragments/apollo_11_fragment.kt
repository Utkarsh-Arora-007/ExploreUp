package com.example.exploreup.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.exploreup.R
import com.example.exploreup.databinding.FragmentApollo11FragmentBinding

class apollo_11_fragment : Fragment() {

    lateinit var binding:FragmentApollo11FragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentApollo11FragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mtxt.text ="\tThe Passive Seismic Experiment Package (PSEP), which was deployed on the lunar sur face by the Apollo 11 astronauts, was the principal tool for determining the internal structure, physical state, tectonic activity, and composition of the Moon. Detailed investigation of the lunar structure must await the establishment and operation of a network of seismic stations; however, a single suitable well-recorded seismic event can provide information that is of fundamental importance and that could not be gained in any other way. \n \n \tThe seismometer package must be moved farther from the LM to reduce interfering noise level caused by the LM. The sensor must be removed from the central station. Better thermal control must be achieved & Higher sensitivity must be sought. Also, the apollo 11 carried Lunar Ranging Retro-Reflector & Solar wind composition. \n\n \tThe Apollo 11 seismometers functioned for 21 Earth days before the loss of command uplink capability terminated operations. During the operational period, all four seismometers of the PSE functioned nominally. Some transient signals of instrument origin were detected. Three categories of signals were also detected; (1) those produced by astronaut activities, (2) those with impulsive onset and short duration, and (3) those with emergent onset and long duration. \n\n \tIt used three long-period seismometers and one short- period vertical seismometer for measuring meteorite impacts and moonquakes, recording about 100 to 200 hits by meteorites during its lifetime.  This experiment measured the amount of dust accumulating on the lunar surface. It also measured the damage to solar cells by high-energy radiation as well as the reflected infrared energy and temperatures of the lunar surface. It consisted of three photocells mounted on the EASEP."

        binding.apollo11.setOnClickListener {
            findNavController().navigate(R.id.action_apollo_11_fragment_to_webViewFragment)
        }

    }
}