package com.example.fragmenfragment.fragments

import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmenfragment.R

class fragmentsDeshboard: Fragment(R.layout.hragment_deshboard){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text =
            fragmentsDeshboardArgs.fromBundle(requireArguments()).amount.toString()


    }
}