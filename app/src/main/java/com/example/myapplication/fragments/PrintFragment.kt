package com.example.myapplication.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class PrintFragment : Fragment(R.layout.fragment_print) {
    private lateinit var textViewYear: TextView
    private lateinit var textViewMonth: TextView
    private lateinit var textViewDay: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        this.textViewYear = view.findViewById(R.id.textViewYear)
        this.textViewMonth = view.findViewById(R.id.textViewMonth)
        this.textViewDay = view.findViewById(R.id.textViewDay)

        val weli = PrintFragmentArgs.fromBundle(requireArguments()).weli
        val tve = PrintFragmentArgs.fromBundle(requireArguments()).tve
        val ricxvi = PrintFragmentArgs.fromBundle(requireArguments()).ricxvi

        if (weli != -1) {
            textViewYear.text = weli.toString()
            textViewMonth.text = tve.toString()
            textViewDay.text = ricxvi.toString()
        }


    }
}