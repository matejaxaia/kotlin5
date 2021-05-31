package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.myapplication.R

class InputFragment : Fragment(R.layout.fragment_input) {

    private lateinit var button: Button
    private lateinit var editTextBirthYear: EditText
    private lateinit var editTextBirthMonth: EditText
    private lateinit var editTextBirthDay: EditText
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.button)
        editTextBirthYear = view.findViewById(R.id.editTextBirthYear)
        editTextBirthMonth = view.findViewById(R.id.editTextBirthMonth)
        editTextBirthDay = view.findViewById(R.id.editTextBirthDay)

        navController = Navigation.findNavController(view)

        button.setOnClickListener {
            var weliwadi = 2021
            var tve = 5
            var ricxvi = 30

            if (editTextBirthYear.text.toString().isNotEmpty()){
                weliwadi = editTextBirthYear.text.toString().toInt()
                tve = editTextBirthMonth.text.toString().toInt()
                ricxvi = editTextBirthDay.text.toString().toInt()
            }

            val action = InputFragmentDirections.actionInputFragmentToPrintFragment(weliwadi, tve, ricxvi)
            navController.navigate(action)

        }
    }
}