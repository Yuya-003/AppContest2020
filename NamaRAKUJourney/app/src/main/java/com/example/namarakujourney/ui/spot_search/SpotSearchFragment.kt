package com.example.namarakujourney.ui.spot_search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.namarakujourney.R

class SpotSearchFragment : Fragment() {

    private lateinit var spotSearchViewModel: SpotSearchViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        spotSearchViewModel =
            ViewModelProviders.of(this).get(SpotSearchViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_spot_search, container, false)
        val textView: TextView = root.findViewById(R.id.text_share)
        spotSearchViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}