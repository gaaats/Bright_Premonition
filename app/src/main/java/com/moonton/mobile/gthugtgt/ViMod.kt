package com.moonton.mobile.gthugtgt

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.moonton.mobile.frygrfgyufr.Util.ihrfihrfhfrhrf
import com.moonton.mobile.ghrfhrfuhrf.Fjfrrfhrfhfr
import com.moonton.mobile.ghrfhrfuhrf.Ijfrirfirfhrf
import com.moonton.mobile.ghrfhrfuhrf.Jfrhihihhfr
import com.moonton.mobile.ghrfhrfuhrf.gtgthyhyhy.HGGfrhkrhfrhrf
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ViMod(
    private val mainRepository: Fjfrrfhrfhfr,
    private val frrfygrfggrfy: Ijfrirfirfhrf,
    private val shP: SharedPreferences,
    val nkgtgtuhgtihiugt: Application
) : ViewModel() {



    private fun fhrrfhfrirfhhfrfr() {
        viewModelScope.launch(Dispatchers.IO) {
            frfbrhbrfbggttggtgttg()
        }
    }

    private val frrfgufrugfrguyfr = MutableLiveData<Jfrhihihhfr>()
    val countryCode: LiveData<Jfrhihihhfr>
        get() = frrfgufrugfrguyfr

    private val frhrfhrfhrf = MutableLiveData<HGGfrhkrhfrhrf>()
    val geo: LiveData<HGGfrhkrhfrhrf>
        get() = frhrfhrfhrf

    init {
        fhrrfhfrirfhhfrfr()
        frfbrfbbfrbfrbhfrhbfrbhfr()
    }

    private fun frfbrfbbfrbfrbhfrhbfrbhfr() {
        viewModelScope.launch(Dispatchers.Main) {
            rfkghhggtugthu()
        }
    }

    private val frbhjrfbfrbfrbhrf = MutableLiveData<String>()
    val rfjorfjjgjgtguthu: LiveData<String>
        get() = frbhjrfbfrbfrbhrf

    private val fvrfhfvrhvfrhgtjgtgtj = MutableLiveData<String?>()
    val mainId: LiveData<String?>
        get() = fvrfhfvrhvfrhgtjgtgtj


    suspend fun rfkghhggtugthu() {
        frrfgufrugfrguyfr.postValue(mainRepository.rfbfrbfrbfrbfr().body())
        frrfbbrfrffrgyg()
    }

    suspend fun frrfbbrfrffrgyg() {
        frhrfhrfhrf.postValue(frrfygrfggrfy.frbrfbjfrb().body())
    }

    fun frrfnkkghgtthug(frfnrrfngtuhugt: Context) {
        AppsFlyerLib.getInstance()
            .init(ihrfihrfhfrhrf, dghvdedevffrgfrgygrfyfrgyfr, nkgtgtuhgtihiugt)
        AppsFlyerLib.getInstance().start(frfnrrfngtuhugt)
    }



    private val dghvdedevffrgfrgygrfyfrgyfr = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            frbhjrfbfrbfrbhrf.postValue(dataGotten)

        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(error: String?) {
        }
    }

    fun frrbfrfbjbfr(cont: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            cont
        ) { data: AppLinkData? ->
            data?.let {
                val frrfjrojrjfrjfri = data.targetUri?.host.toString()
                shP.edit().putString("deepSt", frrfjrojrjfrjfri).apply()
            }
        }
    }


    fun frfbrhbrfbggttggtgttg() {
        val rfrfjigtjgtjgti = AdvertisingIdClient(nkgtgtuhgtihiugt)
        rfrfjigtjgtjgti.start()
        val frjrorfjofrjirji = rfrfjigtjgtjgti.info.id.toString()
        fvrfhfvrhvfrhgtjgtgtj.postValue(frjrorfjofrjirji)
    }

}