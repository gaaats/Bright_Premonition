package com.moonton.mobile.gaaaamamama.gjitgjigtjigt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.moonton.mobile.R
import com.moonton.mobile.databinding.FragmentGaaaaamy3Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class Gaaaaamy3Fragment : Fragment() {
    private var dddd: FragmentGaaaaamy3Binding? = null
    private val yyyyy
        get() = dddd ?: throw RuntimeException("FragmentGaaaaamy3Binding = null")


    private fun eeeeeeee() {
        Snackbar.make(
            yyyyy.root,
            "Error, error, error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dddd = FragmentGaaaaamy3Binding.inflate(inflater, container, false)
        return yyyyy.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            lifecycleScope.launch {

                delay(1500)
                findNavController().navigate(R.id.action_gaaaaamy3Fragment_to_gaaaammmy1Fragment)
            }



        } catch (e: Exception) {
            eeeeeeee()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        dddd = null
        super.onDestroy()
    }
}