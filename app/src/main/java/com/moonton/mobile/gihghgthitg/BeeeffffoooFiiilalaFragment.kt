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
import com.moonton.mobile.frygrfgyufr.Util.appsgtgtgtgt
import com.moonton.mobile.gthugtgt.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class BeeeffffoooFiiilalaFragment : Fragment() {



    override fun onAttach(context: Context) {
        super.onAttach(context)
        gfgtigtigithigt = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_beeeffffooo_fiiilala, container, false)
    }

    val frrfhfrhfrhu by activityViewModel<ViMod>(named("MainModel"))
    val gtgtjtgijtgjjgtfruygfr: SharedPreferences by inject(named("SharedPreferences"))


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gtjgitgitgtj = gtgtjtgijtgjjgtfruygfr.getString(appsgtgtgtgt, null)
        val fbfrfjbbgthgthtghgt = gtgtjtgijtgjjgtfruygfr.getString("appCamp", null)

        if (gtjgitgitgtj=="1" &&fbfrfjbbgthgthtghgt == null) {
            frrfhfrhfrhu.frrfnkkghgtthug(gfgtigtigithigt)
            frrfhfrhfrhu.rfjorfjjgjgtguthu.observe(viewLifecycleOwner) {
                if (it != null) {
                    frrfrffbggtgtgtgt = it.toString()
                    gtgtjtgijtgjjgtfruygfr.edit().putString("appCamp", frrfrffbggtgtgtgt).apply()
                    rfhhfrrfhfruhu()
                }
            }
        } else {
            rfhhfrrfhfruhu()
        }
    }

    lateinit var frrfrffbggtgtgtgt: String
    private lateinit var gfgtigtigithigt: Context

    private fun rfhhfrrfhfruhu() {
        findNavController().navigate(R.id.action_beeeffffoooFiiilalaFragment_to_fiiiilaaaaFragment)
    }

}