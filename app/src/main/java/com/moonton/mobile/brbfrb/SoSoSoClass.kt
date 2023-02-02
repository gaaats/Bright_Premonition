package com.moonton.mobile.brbfrb

import android.app.Application
import android.content.Context
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.ggtgtgtgt
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.gthuigthgthgt
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.myIdggtgtgt
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.tggthyhy4hy
import com.moonton.mobile.gtnkjgtnktgj.dediuedhdehdehued
import com.moonton.mobile.gtnkjgtnktgj.deedbdebbdehfggrfgrfy
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class SoSoSoClass:Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(gthuigthgthgt)

        val gtgtgtgt = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val gtjitgitg = getSharedPreferences("PREFS_NAME", 0)

        val ghyhyyhhy = MyTracker.getTrackerParams()
        val gtghyhyhy = MyTracker.getTrackerConfig()
        val gtgthyhyhyhyhy = MyTracker.getInstanceId(this)
        gtghyhyhy.isTrackingLaunchEnabled = true
        val IDINgttggt = UUID.randomUUID().toString()

        if (gtjitgitg.getBoolean("my_first_time", true)) {
            ghyhyyhhy.setCustomUserId(IDINgttggt)
            gtgtgtgt.edit().putString(myIdggtgtgt, IDINgttggt).apply()
            gtgtgtgt.edit().putString(ggtgtgtgt, gtgthyhyhyhyhy).apply()
            gtjitgitg.edit().putBoolean("my_first_time", false).apply()
        } else {
            val shIDIN = gtgtgtgt.getString(myIdggtgtgt, IDINgttggt)
            ghyhyyhhy.setCustomUserId(shIDIN)
        }
        gtigtihtgihtgihigt()

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@SoSoSoClass)
            modules(
                listOf(
                    deedbdebbdehfggrfgrfy, dediuedhdehdehued
                )
            )
        }
    }

    private fun gtigtihtgihtgihigt() {
        MyTracker.initTracker(tggthyhy4hy, this)
    }
}