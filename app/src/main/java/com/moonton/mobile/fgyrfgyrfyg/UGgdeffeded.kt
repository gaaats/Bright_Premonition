package com.moonton.mobile.fgyrfgyrfyg

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class UGgdeffeded(gthgtihgtigt: Application): ViewModel() {
    val gtggttgthyhy = gthgtihgtigt.packageManager
    fun gttgiohgthgt(gtjgtojjgt: WebView): WebSettings{
       val gttgkptgtgtgjo = gtjgtojjgt.settings
        gttgkptgtgtgjo.javaScriptEnabled = true
        gttgkptgtgtgjo.useWideViewPort = true
        gttgkptgtgtgjo.loadWithOverviewMode = true
        gttgkptgtgtgjo.allowFileAccess = true
        gttgkptgtgtgjo.domStorageEnabled = true
        gttgkptgtgtgjo.userAgentString = gttgkptgtgtgjo.userAgentString.replace("; wv", "")
        gttgkptgtgtgjo.javaScriptCanOpenWindowsAutomatically = true
        gttgkptgtgtgjo.setSupportMultipleWindows(false)
        gttgkptgtgtgjo.displayZoomControls = false
        gttgkptgtgtgjo.builtInZoomControls = true
        gttgkptgtgtgjo.allowFileAccess = true
        gttgkptgtgtgjo.allowContentAccess = true
        gttgkptgtgtgjo.setSupportZoom(true)
        gttgkptgtgtgjo.pluginState = WebSettings.PluginState.ON
        gttgkptgtgtgjo.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        gttgkptgtgtgjo.cacheMode = WebSettings.LOAD_DEFAULT
        gttgkptgtgtgjo.allowContentAccess = true
        gttgkptgtgtgjo.mediaPlaybackRequiresUserGesture = false
        return gttgkptgtgtgjo
    }
    fun gbjgtbjbgtbgthb(id: String) {
        OneSignal.setExternalUserId(
            id,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val isPushSuccess = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $isPushSuccess"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val isEmailSuccess =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $isEmailSuccess"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val isSmsSuccess = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $isSmsSuccess"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    fun uirirfgrfgfrggyfr(uri: String): Boolean {
        try {
            gtggttgthyhy.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }
}