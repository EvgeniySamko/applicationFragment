package com.example.applicationfragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment : Fragment(R.layout.fragment_second) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val firstName = requireActivity().findViewById<TextView>(R.id.etFirstName2)
        val lastName = requireActivity().findViewById<TextView>(R.id.etLastName2)
        val email = requireActivity().findViewById<TextView>(R.id.etEmail2)
        val clearButton = requireActivity().findViewById<Button>(R.id.btnClear)


        firstName.text = arguments?.getString("firstName")
        lastName.text = arguments?.getString("lastName")
        email.text = arguments?.getString("email")


        clearButton.setOnClickListener {

            parentFragmentManager.beginTransaction()
                .replace(android.R.id.content, FirstFragment()).commit()
        }
    }
}