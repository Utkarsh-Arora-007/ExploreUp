package com.example.exploreup.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import com.example.exploreup.R

import com.example.exploreup.databinding.FragmentApollo15WebViewBinding


class Apollo15WebView : Fragment() {


lateinit var binding: FragmentApollo15WebViewBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentApollo15WebViewBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.webView.apply {

            loadUrl("https://www.nasa.gov/mission_pages/apollo/missions/apollo15.html")
            webViewClient = WebViewClient()
            settings.javaScriptEnabled= true


        }
    }


}