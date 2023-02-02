package com.moonton.mobile.gtnkjgtnktgj

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.moonton.mobile.fgyrfgyrfyg.UGgdeffeded
import com.moonton.mobile.ghrfhrfuhrf.Fjfrrfhrfhfr
import com.moonton.mobile.ghrfhrfuhrf.Ijfrirfirfhrf
import com.moonton.mobile.ghrfhrfuhrf.frrfrfrffrrf.Gfigrgrfgrf
import com.moonton.mobile.ghrfhrfuhrf.frrfrfrffrrf.Yfrgrfyufgrfgry
import com.moonton.mobile.gthugtgt.Ojfrjrjrfhrf
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val deedbdebbdehfggrfgrfy = module {
    viewModel (named("MainModel")){
        Ojfrjrjrfhrf((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        UGgdeffeded(get())
    }
}

val dediuedhdehdehued = module {


    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://exaltedgriffin.live/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Fjfrrfhrfhfr(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Ijfrirfirfhrf(get(named("HostInter")))
    }
    single  <Yfrgrfyufgrfgry> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Yfrgrfyufgrfgry::class.java)
    }

    single <Gfigrgrfgrf> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Gfigrgrfgrf::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }

    single{
        rfrfjrfhfrhrfgugfrgyrf()
    }
    single (named("SharedPreferences")) {
        frrfjiorfrfjfrfi(androidApplication())
    }
}

fun frrfjiorfrfjfrfi(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun rfrfjrfhfrhrfgugfrgyrf(): Gson {
    return GsonBuilder().create()
}

