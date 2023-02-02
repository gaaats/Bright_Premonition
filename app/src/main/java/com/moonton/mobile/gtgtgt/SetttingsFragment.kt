package com.moonton.mobile.gtgtgt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import com.moonton.mobile.databinding.FragmentSetttingsBinding


class SetttingsFragment : Fragment() {
    override fun onDestroy() {
        soska = null
        super.onDestroy()
    }

    private fun gtgtgt() {
        Snackbar.make(
            ssskkaa.root,
            "Error 505...reloading...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var soska: FragmentSetttingsBinding? = null
    private val ssskkaa get() = soska ?: throw RuntimeException("FragmentSetttingsBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        soska = FragmentSetttingsBinding.inflate(inflater, container, false)
        return ssskkaa.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            ssskkaa.root.background.alpha = 230

            ssskkaa.btnImgExitInfo.setOnClickListener {
                requireActivity().onBackPressed()
            }
            ssskkaa.btnUnderstandGameRules.setOnClickListener {
                requireActivity().onBackPressed()
            }



        } catch (e: Exception) {
            gtgtgt()
        }


        super.onViewCreated(view, savedInstanceState)
    }



}