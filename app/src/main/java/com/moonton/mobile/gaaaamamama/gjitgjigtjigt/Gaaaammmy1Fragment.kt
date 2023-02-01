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
import com.moonton.mobile.databinding.FragmentGaaaammmy1Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class Gaaaammmy1Fragment : Fragment() {
    private var dddd: FragmentGaaaammmy1Binding? = null
    private val yyyyy
        get() = dddd ?: throw RuntimeException("FragmentGaaaammmy1Binding = null")


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
        dddd = FragmentGaaaammmy1Binding.inflate(inflater, container, false)
        return yyyyy.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            uirfrfhfrhrfhuirfhf()



        } catch (e: Exception) {
            eeeeeeee()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun uirfrfhfrhrfhuirfhf() {
        lifecycleScope.launch {

            delay(1500)
            friurfhhirfhfrrfhfr()
        }
    }

    private fun friurfhhirfhfrrfhfr() {
        findNavController().navigate(R.id.action_gaaaammmy1Fragment_to_gaaaammyyy2Fragment)
    }

    override fun onDestroy() {
        dddd = null
        super.onDestroy()
    }
}