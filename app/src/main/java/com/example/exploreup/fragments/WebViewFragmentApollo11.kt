package com.example.exploreup.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.example.exploreup.R
import com.example.exploreup.databinding.FragmentApollo17FragmentBinding
import com.example.exploreup.databinding.FragmentWebViewBinding

class WebViewFragmentApollo11 : Fragment() {

    lateinit var binding: FragmentWebViewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWebViewBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.webView.apply {

            loadUrl("https://www.nasa.gov/mission_pages/apollo/missions/apollo11.html")
            webViewClient = WebViewClient()
            settings.javaScriptEnabled= true

        }
    }


}