package com.moonton.mobile.gthgthtgiuugt

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.moonton.mobile.R
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.gngtkntgngtngt
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.urlMain
import com.moonton.mobile.gthugtgt.Ojfrjrjrfhrf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SeeeeecccMaaainragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seeeeeccc_maaainragment, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtitjgtirfurfggfryfr = context
    }

    val ffhrrfrfyggfryrf by activityViewModel<Ojfrjrjrfhrf>(named("MainModel"))
    lateinit var frjrfjjjgtjgtjigtji: String
    lateinit var frbfrrbfrfbhfr: String
    lateinit var cvdgvdcvdcvdgc: String
    private lateinit var gtitjgtirfurfggfryfr: Context

    val vbfhfbrrfgfyrfryyfr: SharedPreferences by inject(named("SharedPreferences"))

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        frhhfrirfhhrfhu()

        gthhgthgthighgthdgeyged()
    }

    private fun gthhgthgthighgthdgeyged() {
        ffhrrfrfyggfryrf.geo.observe(viewLifecycleOwner) {
            if (it != null) {

                frjrfjjjgtjgtjigtji = it.gtgtihgt
                cvdgvdcvdcvdgc = it.fbfrbrfhb
                frbfrrbfrfbhfr = it.gtgtitghgt

                vbfhfbrrfgfyrfryyfr.edit().putString(gngtkntgngtngt, frjrfjjjgtjgtjigtji).apply()
                vbfhfbrrfgfyrfryyfr.edit().putString(GYUgdyggfryg.appsgtgtgtgt, cvdgvdcvdcvdgc).apply()
                vbfhfbrrfgfyrfryyfr.edit().putString(urlMain, frbfrrbfrfbhfr).apply()

                rfufhfrhfrhhrfhrfhurf()
            }
        }
    }

    private fun rfufhfrhfrhhrfhrfhurf() {
        findNavController().navigate(R.id.action_seeeeecccMaaainragment_to_beeeffffoooFiiilalaFragment)
    }

    private fun frhhfrirfhhrfhu() {
        ffhrrfrfyggfryrf.mainId.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                vbfhfbrrfgfyrfryyfr.edit().putString("mainId", main).apply()
            }
        }
    }
}