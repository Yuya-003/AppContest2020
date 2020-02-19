package com.example.namarakujourney.ui.conversation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.namarakujourney.R

class ConversationFragment : Fragment() {

    private lateinit var conversationViewModel: ConversationViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        conversationViewModel =
            ViewModelProviders.of(this).get(ConversationViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_conversation, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        conversationViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}