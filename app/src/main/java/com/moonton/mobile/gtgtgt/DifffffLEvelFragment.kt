package com.moonton.mobile.gtgtgt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.moonton.mobile.R
import com.moonton.mobile.databinding.FragmentDifffffLEvelBinding


class DifffffLEvelFragment : Fragment() {
    private fun gthyhuyjuju() {
        Snackbar.make(
            ssskkaa.root,
            "Error 505...reloading...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var nhnhnh: FragmentDifffffLEvelBinding? = null
    private val ssskkaa get() = nhnhnh ?: throw RuntimeException("FragmentInitBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        nhnhnh = FragmentDifffffLEvelBinding.inflate(inflater, container, false)
        return ssskkaa.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            ssskkaa.clooose.setOnClickListener {
                requireActivity().finish()
            }

            ssskkaa.imgNext.setOnClickListener {

                findNavController().navigate(R.id.action_difffffLEvelFragment_to_gaaaammmy1Fragment)
            }
            ssskkaa.imgPrevious.setOnClickListener {
                requireActivity().onBackPressed()
            }

            ssskkaa.imgInfo.setOnClickListener {
                findNavController().navigate(R.id.action_difffffLEvelFragment_to_infoFragFragment)
            }
            ssskkaa.imgsettings.setOnClickListener {
                findNavController().navigate(R.id.action_difffffLEvelFragment_to_setttingsFragment)
            }

        } catch (e: Exception) {
            gthyhuyjuju()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        nhnhnh = null
        super.onDestroy()
    }

}