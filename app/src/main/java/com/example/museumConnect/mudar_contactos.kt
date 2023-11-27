package com.example.museumConnect

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.museumConnect.R

class mudar_contactos : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mudar_contactos, container, false)

        //Navigation.findNavController(view).navigate(R.id.action_navigation_account_to_mudar_contactos)


    }

}