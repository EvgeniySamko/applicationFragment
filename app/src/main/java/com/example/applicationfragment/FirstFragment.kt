package com.example.applicationfragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstName = requireActivity().findViewById<EditText>(R.id.etFirstName)
        val lastName = requireActivity().findViewById<EditText>(R.id.etLastName)
        val email = requireActivity().findViewById<EditText>(R.id.etEmail)
        val savedButton = requireActivity().findViewById<Button>(R.id.btnSave)


        savedButton.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("firstName", firstName.text.toString())
            bundle.putString("lastName", lastName.text.toString())
            bundle.putString("email", email.text.toString())
            val secondFragment = SecondFragment()
            secondFragment.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(android.R.id.content, secondFragment).commit()
        }
    }
}