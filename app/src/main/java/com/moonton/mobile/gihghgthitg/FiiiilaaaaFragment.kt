package com.moonton.mobile.gihghgthitg


import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.gthigthgt
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.myIdggtgtgt
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.gtgtjogtjogtogt
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.gtigthihgthgt
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.paaakakakaka
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.frfhirfhrfhrfifr
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.frkbrrfbbrfb
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.moonton.mobile.gaaaamamama.gjitgjigtjigt.GaaaaaaaammmmuuuActivity2
import com.moonton.mobile.R
import com.moonton.mobile.vvveeevvv.VeeeeeeeeeeeeevActivity2
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.frrfufrguygyrf
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.appsgtgtgtgt
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.aps_idhyhyhyhyhy
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.gngtkntgngtngt
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.gtjgtjojtgo
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.ggtgtgtgt
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.ggthgtiuhgti
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.frrfbjjbhfrbjhfr
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.gtjiojggtjgt
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.rfrfhifrihrfhi
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.urlMain
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FiiiilaaaaFragment : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val frfhifrhirfhi = gtgthigthigtihgt.getString(gtjgtjojtgo, null)
        val frrfrbrfrfbrfbj = gtgthigthigtihgt.getString("appCamp", null)
        val frrfgrfgfrbfrbfrb = gtgthigthigtihgt.getString("deepSt", null)
        val countryDevgttggt = gtgthigthigtihgt.getString(gngtkntgngtngt, null)
        val appsggtgt = gtgthigthigtihgt.getString(appsgtgtgtgt, null)
        val ffrfnrfnrfnnrf = gtgthigthigtihgt.getString(urlMain, null)
        val rffrhrihrhrfirf = gtgthigthigtihgt.getString("mainId", null)
        val gtgtotjgtjjtgjo = paaakakakaka
        val gtgtojjjoigt = Build.VERSION.RELEASE
        val frrfbrfbjgdeyfedfed = gtgthigthigtihgt.getString(myIdggtgtgt, null)
        val frfrbjhrfbrfgdffdeted: String? = gtgthigthigtihgt.getString(ggtgtgtgt, null)

        val edhjbdeedvededed = Intent(activity, VeeeeeeeeeeeeevActivity2::class.java)
        val tgmtkgntgtgtgthugt = Intent(activity, GaaaaaaaammmmuuuActivity2::class.java)

        val rfrffbvbgrggfrygfr = AppsFlyerLib.getInstance().getAppsFlyerUID(frfrrfihfrhirf)
        hrfrfhfrhfrrfhufui()

        gtgthigthigtihgt.edit().putString(aps_idhyhyhyhyhy, rfrffbvbgrggfrygfr).apply()

        val frbfrjrfhjrf = "$ffrfnrfnrfnnrf$frrfbjjbhfrbjhfr$frrfrbrfrfbrfbj&$gtigthihgthgt$rfrffbvbgrggfrygfr&$frrfufrguygyrf$rffrhrihrhrfirf&$frkbrrfbbrfb$gtgtotjgtjjtgjo&$frfhirfhrfhrfifr$gtgtojjjoigt&$gtjiojggtjgt$gtgtjogtjogtogt"
        val frfrjrfrfuirfhfr = "$ffrfnrfnrfnnrf$gtigthihgthgt$frrfbrfbjgdeyfedfed&$frrfufrguygyrf$frfrbjhrfbrfgdffdeted&$frkbrrfbbrfb$gtgtotjgtjjtgjo&$frfhirfhrfhrfifr$gtgtojjjoigt&$gtjiojggtjgt$gtgtjogtjogtogt"
        val frfbfrhbfrbrfhfr = "$ffrfnrfnrfnnrf$frrfbjjbhfrbjhfr$frrfgrfgfrbfrbfrb&$gtigthihgthgt$rfrffbvbgrggfrygfr&$frrfufrguygyrf$rffrhrihrhrfirf&$frkbrrfbbrfb$gtgtotjgtjjtgjo&$frfhirfhrfhrfifr$gtgtojjjoigt&$gtjiojggtjgt$rfrfhifrihrfhi"
        val tggtkgtohjhyyhj = "$ffrfnrfnrfnnrf$frrfbjjbhfrbjhfr$frrfgrfgfrbfrbfrb&$gtigthihgthgt$frrfbrfbjgdeyfedfed&$frrfufrguygyrf$frfrbjhrfbrfgdffdeted&$frkbrrfbbrfb$gtgtotjgtjjtgjo&$frfhirfhrfhrfifr$gtgtojjjoigt&$gtjiojggtjgt$rfrfhifrihrfhi"

        when(appsggtgt) {
            "1" ->
                if(frrfrbrfrfbrfbj!!.contains(ggthgtiuhgti)) {
                    gtgthigthigtihgt.edit().putString(gthigthgt, frbfrjrfhjrf).apply()
                    gtgthigthigtihgt.edit().putString("WebInt", "campaign").apply()
                    startActivity(edhjbdeedvededed)
                    activity?.finish()
                } else if (frrfgrfgfrbfrbfrb!=null||countryDevgttggt!!.contains(frfhifrhirfhi.toString())) {
                    gtgthigthigtihgt.edit().putString(gthigthgt, frfbfrhbfrbrfhfr).apply()
                    gtgthigthigtihgt.edit().putString("WebInt", "deepLink").apply()
                    startActivity(edhjbdeedvededed)
                    activity?.finish()
                } else {
                    startActivity(tgmtkgntgtgtgthugt)
                    activity?.finish()
                }
            "0" ->
                if(frrfgrfgfrbfrbfrb!=null) {
                    gtgthigthigtihgt.edit().putString(gthigthgt, tggtkgtohjhyyhj).apply()
                    gtgthigthigtihgt.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(edhjbdeedvededed)
                    activity?.finish()
                } else if (countryDevgttggt!!.contains(frfhifrhirfhi.toString())) {
                    gtgthigthigtihgt.edit().putString(gthigthgt, frfrjrfrfuirfhfr).apply()
                    gtgthigthigtihgt.edit().putString("WebInt", "geo").apply()
                    startActivity(edhjbdeedvededed)
                    activity?.finish()
                } else {
                    startActivity(tgmtkgntgtgtgthugt)
                    activity?.finish()
                }
        }
    }

    private fun hrfrfhfrhfrrfhufui() {
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
    }

    private lateinit var frfrrfihfrhirf: Context
    val gtgthigthigtihgt: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        frfrrfihfrhirf = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiiiilaaaa, container, false)
    }
}
