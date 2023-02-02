package com.moonton.mobile.vvveeevvv

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.moonton.mobile.databinding.ActivityVeeeeeeeeeeeeev2Binding
import com.moonton.mobile.fgyrfgyrfyg.UGgdeffeded
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.aps_idhyhyhyhyhy
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.gthigthgt
import com.moonton.mobile.frygrfgyufr.GYUgdyggfryg.myIdggtgtgt
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class VeeeeeeeeeeeeevActivity2 : AppCompatActivity() {

    private fun ffrfrgtgtgtgt(): String {

        val frhrfuhhrfhu = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val frrfhfrhufrgfr = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)

        val link = frrfhfrhufrgfr.getString(gthigthgt, null)
        Log.d("lolo", link.toString())

        val myTrId = frrfhfrhufrgfr.getString(myIdggtgtgt, null)
        val afId = frrfhfrhufrgfr.getString(aps_idhyhyhyhyhy, null)


        when (frrfhfrhufrgfr.getString("WebInt", null)) {
            "campaign" -> {
                ffrbrffryrfgfrygfrygf.gbjgtbjbgtbgthb(afId.toString())
            }
            "deepLink" -> {
                ffrbrffryrfgfrygfrygf.gbjgtbjbgtbgthb(afId.toString())
            }
            "deepLinkNOApps" -> {
                ffrbrffryrfgfrygfrygf.gbjgtbjbgtbgthb(myTrId.toString())
            }
            "geo" -> {
                ffrbrffryrfgfrygfrygf.gbjgtbjbgtbgthb(myTrId.toString())
            }
        }
        return frhrfuhhrfhu.getString("SAVED_URL", link).toString()
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != igthyhyhyhyhy || mfrgtgthyhyhyhyhy == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var frrfuhuhhurf: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (mgtgthyhyjuuj != null) {
                    frrfuhuhhurf = arrayOf(Uri.parse(mgtgthyhyjuuj))
                }
            } else {
                val edegedygdegy = data.dataString
                if (edegedygdegy != null) {
                    frrfuhuhhurf = arrayOf(Uri.parse(edegedygdegy))
                }
            }
        }
        mfrgtgthyhyhyhyhy!!.onReceiveValue(frrfuhuhhurf)
        mfrgtgthyhyhyhyhy = null
        return
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bfrrfjfriurfhurf = ActivityVeeeeeeeeeeeeev2Binding.inflate(layoutInflater)
        bgthyhyjjuuj = WebView(this)
        setContentView(bgthyhyjjuuj)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(bgthyhyjjuuj, true)
        ffrbrffryrfgfrygfrygf.gttgiohgthgt(bgthyhyjjuuj)

        bgthyhyjjuuj.webViewClient = Cjfrrffrhfruhf()
        bgthyhyjjuuj.webChromeClient = HBJfrgrfgrfgyfr()
        bgthyhyjjuuj.loadUrl(ffrfrgtgtgtgt())
    }

    private lateinit var bfrrfjfriurfhurf: ActivityVeeeeeeeeeeeeev2Binding
    lateinit var bgthyhyjjuuj: WebView


    inner class Cjfrrffrhfruhf: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (ffrbrffryrfgfrygfrygf.uirirfgrfgfrggyfr(url)) {

                    val frrfhrfrfygfrg = Intent(Intent.ACTION_VIEW)
                    frrfhrfrfygfrg.data = Uri.parse(url)
                    startActivity(frrfhrfrfygfrg)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@VeeeeeeeeeeeeevActivity2, description, Toast.LENGTH_SHORT).show()
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            bggttghyhyhyjujuuj(url)
        }



    }


    inner class HBJfrgrfgrfgyfr : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            mfrgtgthyhyhyhyhy?.onReceiveValue(null)
            mfrgtgthyhyhyhyhy = filePath
            var frfrfrbrfygfrygfr: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (frfrfrbrfygfrygfr!!.resolveActivity(packageManager) != null) {
                var rfgfrrfgyfr: File? = null
                try {
                    rfgfrrfgyfr = gthitgihtgiuthgt()
                    frfrfrbrfygfrygfr.putExtra("PhotoPath", mgtgthyhyjuuj)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (rfgfrrfgyfr != null) {
                    mgtgthyhyjuuj = "file:" + rfgfrrfgyfr.absolutePath
                    frfrfrbrfygfrygfr.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(rfgfrrfgyfr)
                    )
                } else {
                    frfrfrbrfygfrygfr = null
                }
            }
            val frrfbhfrgyfrgfry = Intent(Intent.ACTION_GET_CONTENT)
            frrfbhfrgyfrgfry.addCategory(Intent.CATEGORY_OPENABLE)
            frrfbhfrgyfrgfry.type = "image/*"
            val frrfbrfbhfr: Array<Intent?> = frfrfrbrfygfrygfr?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val rfrfrhrfgyfr = Intent(Intent.ACTION_CHOOSER)
            rfrfrhrfgyfr.putExtra(Intent.EXTRA_INTENT, frrfbhfrgyfrgfry)
            rfrfrhrfgyfr.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            rfrfrhrfgyfr.putExtra(Intent.EXTRA_INITIAL_INTENTS, frrfbrfbhfr)
            startActivityForResult(rfrfrhrfgyfr, igthyhyhyhyhy)
            return true
        }

        fun gthitgihtgiuthgt(): File? {
            val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val imageFileName = "JPEG_" + timeStamp + "_"
            val storageDir = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                imageFileName,
                ".jpg",
                storageDir
            )
        }
    }

    private var mfrgtgthyhyhyhyhy: ValueCallback<Array<Uri>>? = null
    private var mgtgthyhyjuuj: String? = null
    private  val igthyhyhyhyhy = 1

    private val ffrbrffryrfgfrygfrygf by viewModel<UGgdeffeded>(
        named("BeamModel")
    )



    var urlfifififugtggtgtgtgt = ""
    fun bggttghyhyhyjujuuj(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (urlfifififugtggtgtgtgt == "") {
                urlfifififugtggtgtgtgt = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val spspspspsppspspsp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", lurlurlurlurlur)
                ededededededed.apply()
            }
        }
    }
    private var efrgtgthyhyhy = false
    override fun onBackPressed() {

        if (bgthyhyjjuuj.canGoBack()) {
            if (efrgtgthyhyhy) {
                bgthyhyjjuuj.stopLoading()
                bgthyhyjjuuj.loadUrl(urlfifififugtggtgtgtgt)
            }
            this.efrgtgthyhyhy = true
            bgthyhyjjuuj.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                efrgtgthyhyhy = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }
}

