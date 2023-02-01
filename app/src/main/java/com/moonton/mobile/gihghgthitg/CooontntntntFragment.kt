package com.moonton.mobile.gihghgthitg

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.moonton.mobile.R
import com.moonton.mobile.frygrfgyufr.Util.gtjgtjojtgo
import com.moonton.mobile.gthugtgt.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class CooontntntntFragment : Fragment() {
    private lateinit var frrfhrfgfrgyu: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        frrfhrfgfrgyu = context
    }

    val gtihgthgthihddbdb: SharedPreferences by inject(named("SharedPreferences"))
    val gtngtgtgtgtugth by activityViewModel<ViMod>(named("MainModel"))

    lateinit var rfrfbhjfrbbfrhbhrf: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cooontntntnt, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hgthigthigthgtihgth()
    }

    private fun hgthigthigthgtihgth() {
        gtngtgtgtgtugth.countryCode.observe(viewLifecycleOwner) {
            if (it != null) {
                rfrfbhjfrbbfrhbhrf = it.rfhfrgfrgfr
                gtihgthgthihddbdb.edit().putString(gtjgtjojtgo, rfrfbhjfrbbfrhbhrf).apply()
                ghihgtihgthtgiiugti()
            }
        }
    }

    private fun ghihgtihgthtgiiugti() {
        findNavController().navigate(R.id.action_cooontntntntFragment_to_seeeeecccMaaainragment)
    }
}