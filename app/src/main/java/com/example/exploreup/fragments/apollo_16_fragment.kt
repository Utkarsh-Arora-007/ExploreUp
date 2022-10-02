package com.example.exploreup.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.exploreup.R
import com.example.exploreup.databinding.FragmentApollo15FragmentBinding
import com.example.exploreup.databinding.FragmentApollo16FragmentBinding

class apollo_16_fragment : Fragment() {
    lateinit var binding: FragmentApollo16FragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentApollo16FragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.mtxt4.text ="\tThe Apollo 16 PSE was the most sensitive seismological instrument emplaced on the Moon during the Apollo program. The instrument continued the observations made by the earlier missions and served to expand the lunar seismic network. The only problems encountered in the instrument were with the sensor thermal control system and excessive noise from the SPZ seismometer. This noise occurred at intervals that appear to have correlated with the temperature fluctuation cycle\n" +
                "\t The core is probably composed mostly of iron and sulfur and extends from the center of the Moon out to a radius of no more than 450 kilometers, i.e., the core radius is less than 25% of the Moon's radius, which is quite small. In comparison, the Earth's core radius is 54% of the Earth's radius. However, the size of the lunar core is not well constrained by existing seismic observations. Better constraints come from the laser ranging retroreflector and magnetometer experiments.\n" +
                "\the activation of the Apollo 16 passive seismom eter resulted in a four-station seismic network on the near side of the Moon. Because of a fortuitous impedance match between the Apollo 16 seismom eter, the local regolith, and the underlying lunar crust, the seismic station at Descartes is an order of magnitude more sensitive than stations on the maria and five times more sensitive than the station at the Fra Mauro site .\n" +
                "\tApollo 16 active seismic ex periment was to determine the local structure of the regolith and of the shallow lunar crust. The near surface, compressional-wave velocity at the Descartes site was 114 m/sec. The lunar crust in the highlands is approxi mately 60 km thick. (2) The lunar crust in the highlands consists primarily of gabbroic and anorthositic material. The maria were formed by the excavation of the initial crust by meteoroid impacts and subsequent flooding by basaltic material. From seismic evidence, the basalt layer in the southeastern portion of Oceanus Procellarum may be 25 km thick, which is comparable to the thickness inferred for mascon maria.\n"



        binding.apollo16.setOnClickListener {
            findNavController().navigate(R.id.action_apollo_16_fragment_to_apollo16WebView)
        }
    }



}