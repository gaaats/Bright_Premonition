package com.moonton.mobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.moonton.mobile.databinding.FragmentEnteeerGameBinding


class EnteeerGameFragment : Fragment() {


    private fun gthyhuyjuju() {
        Snackbar.make(
            ssskkaa.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var soska: FragmentEnteeerGameBinding? = null
    private val ssskkaa get() = soska ?: throw RuntimeException("FragmentEnteeerGameBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        soska = FragmentEnteeerGameBinding.inflate(inflater, container, false)
        return ssskkaa.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            ssskkaa.root.background.alpha = 230


            ssskkaa.btnPlayGameeee.setOnClickListener {
                findNavController().navigate(R.id.action_enteeerGameFragment_to_difffffLEvelFragment)
            }

        } catch (e: Exception) {
            gthyhuyjuju()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        soska = null
        super.onDestroy()
    }

}