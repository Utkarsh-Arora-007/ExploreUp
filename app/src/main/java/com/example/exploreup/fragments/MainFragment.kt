package com.example.exploreup.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.exploreup.R
import com.example.exploreup.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.txt1.text = "Moonquakes – as they are known on the moon – are produced as a result of meteoroids hitting the surface or by the gravitational pull of the Earth squeezing and stretching the moon's interior, in a similar way to the moon's tidal pull on Earth's oceans.\n" +
                "A moonquake is the lunar equivalent of an earthquake (i.e., a quake on the Moon) although moonquakes are caused in different ways. They were first discovered by the Apollo astronauts."

        binding.txt2.text = "We build a binary classifier trained on spectrograms of Earth seismic events, test its accuracy on labelled seismic arrivals within the Apollo Passive Seismic (PSE) data set, and use it to assess the frequency of thermal moonquakes recorded within the Apollo 17 Lunar Seismic Profiling Experiment (LSPE)."


        binding.expeditionsBtn.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_apollo_missions_fragment)
        }


    }

}