package com.brawlegypt.edyptianbrawl.fragmentsgame

import android.animation.LayoutTransition
import android.os.CountDownTimer
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import com.brawlegypt.edyptianbrawl.LoadingsWindow
import com.brawlegypt.edyptianbrawl.R
import com.brawlegypt.edyptianbrawl.adapters.adapters
import com.brawlegypt.edyptianbrawl.databinding.FragmentGameEgiptBinding
import java.util.*


var gameadapterstime: CountDownTimer? = null
var gameadapterstime2: CountDownTimer? = null
var gameadapterstime3: CountDownTimer? = null
var gameadapterstime4: CountDownTimer? = null
var gameadapterstime5: CountDownTimer? = null
var gameadapterstime6: CountDownTimer? = null
var gameadapterstime7: CountDownTimer? = null
var egipetView: CountDownTimer? = null
lateinit var egiptBrawls: ConstraintLayout
val BrawlsEgypts: Random = Random()



class gameEgipt : adapters<FragmentGameEgiptBinding>(FragmentGameEgiptBinding::inflate) {

    override fun webViewOpenGameAzart(){

        egiptBrawls = wildbberriiessBin.okno
        if(oknomoeokno.otsosiMOIXYI.value != null){
        }
        else{
            oknomoeokno.otsosiMOIXYI.value = 0
        }
        wildbberriiessBin.tubus12.setOnClickListener {
            wildbberriiessBin.tubus13.visibility = View.GONE
            wildbberriiessBin.tubus12.visibility = View.GONE

            when(BrawlsEgypts.nextInt(3)){
                0->gameDownHach(wildbberriiessBin.tubus9)
                1->gameDownHach(wildbberriiessBin.tubus9)
                2->gameDownHach(wildbberriiessBin.tubus11)
            }
            gameDownglass()
        }

        wildbberriiessBin.tubus1.setOnClickListener {
            SizeDipamides(0)
        }
        wildbberriiessBin.tubus2.setOnClickListener {
            SizeDipamides(1)
        }
        wildbberriiessBin.tubus1.setOnClickListener {
            SizeDipamides(2)
        }

    }

    private fun gameDownHach(egipetBrawl: View){

        egipetBrawl.visibility = View.VISIBLE
        val loadingWindow = AnimationUtils.loadAnimation(requireContext(),
            R.anim.dvizhenievniz)
        egipetBrawl.startAnimation(loadingWindow)
        egipetView = object : CountDownTimer(1000, 1000) {
            override fun onTick(sec: Long) {}
            override fun onFinish() {
                egipetBrawl.visibility = View.GONE
                egipetView?.cancel()
                popka1()
            }
        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        layout()
    }

    override fun onStop() {
        super.onStop()
        layout()
    }

    override fun onPause() {
        super.onPause()
        layout()
    }
    private fun layout(){
        gameadapterstime?.cancel()
        gameadapterstime2?.cancel()
        gameadapterstime3?.cancel()
        gameadapterstime4?.cancel()
        gameadapterstime5?.cancel()
        gameadapterstime6?.cancel()
        gameadapterstime7?.cancel()
        egipetView?.cancel()
    }

    private fun lotoGame(gameViewToL: View){
        gameGo(djopa = gameViewToL)
        popka3()
    }

    private fun gameGo(djopa: View) {
        val suckmypines = AnimationUtils.loadAnimation(requireContext(),
            R.anim.dvizhenievpravo)
        suckmypines.fillAfter = true
        djopa.startAnimation(suckmypines)
    }

    private fun lotoGamerI(djopaL: View, gjopaR: Int, djopaLR: Int){
        lotoGame(djopaL)
        gameadapterstime = object : CountDownTimer(700, 700) {
            override fun onTick(p1: Long) {}
            override fun onFinish() {
                gameadapterstime?.cancel()
                egiptBrawls.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
                val PusiMysi = ConstraintSet()
                PusiMysi.clone(egiptBrawls)
                PusiLoveMyDjusi(PusiMysi, gjopaR,djopaLR)
                TransitionManager.beginDelayedTransition(egiptBrawls, AutoTransition().setStartDelay(5000))
                PusiMysi.applyTo(egiptBrawls)
                popka2()
            }
        }.start()
    }

    private fun PusiLoveMyDjusi(gettings: ConstraintSet, yebashka: Int, loshka: Int) {
        gettings.clear(yebashka, ConstraintSet.LEFT)
        gettings.clear(yebashka, ConstraintSet.TOP)
        gettings.connect(yebashka, ConstraintSet.LEFT, yebashka, ConstraintSet.LEFT)
        gettings.connect(yebashka, ConstraintSet.BOTTOM, loshka, ConstraintSet.TOP, R.dimen.dim25
        )
        popka3()
    }

    private fun refactorRRR(pilotka: View){
        Lokixyi(pisisisi = pilotka)
        popka3()

    }

    private fun Lokixyi(pisisisi: View) {
        val mouse = AnimationUtils.loadAnimation(requireContext(),
            R.anim.dvizhenievlevo)
        mouse.fillAfter = true
        pisisisi.startAnimation(mouse)
        popka2()
    }

    private fun gamePusiMysiDjusi(misha: View, ebisha: Int, gashisha: Int){
        refactorRRR(misha)
        gameadapterstime2 = object : CountDownTimer(700, 700) {
            override fun onTick(p1: Long) {}
            override fun onFinish() {
                popka3()
                gameadapterstime2?.cancel()
                egiptBrawls.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
                val loveMyAlina = ConstraintSet()
                loveMyAlina.clone(egiptBrawls)
                PusiLoveMyDjusi(loveMyAlina, ebisha,gashisha)
                TransitionManager.beginDelayedTransition(egiptBrawls, AutoTransition().setStartDelay(5000))
                loveMyAlina.applyTo(egiptBrawls)
            }
        }.start()
    }

    private fun gameDownglass(){

        gameadapterstime3 = object : CountDownTimer(2000, 2000) {
            override fun onTick(millionseconds: Long) {}
            override fun onFinish() {
                PopkaJopka()
                lotoGamerI(wildbberriiessBin.tubus4, R.id.tubus4, R.id.tubus5)
                gameadapterstime3?.cancel()
popka2()
            }
        }.start()
    }

    private fun PopkaJopka(){
        gameadapterstime4 = object : CountDownTimer(2000, 2000) {
            override fun onTick(kykimyki: Long) {}
            override fun onFinish() {
                tyzmalafia()
                gamePusiMysiDjusi(wildbberriiessBin.tubus6, R.id.tubus6, R.id.tubus5)
popka1()
                gameadapterstime4?.cancel()
            }
        }.start()
    }

    private fun tyzmalafia(){
        cocamokaPikaLoka()
        gameadapterstime5 = object : CountDownTimer(2000, 2000) {
            override fun onTick(fig: Long) {}
            override fun onFinish() {
                gamePusiMysiDjusi(wildbberriiessBin.tubus7, R.id.tubus7, R.id.tubus1)
                wildbberriiessBin.tubus8.visibility = View.VISIBLE
                gameadapterstime5?.cancel()
                popka3()
            }
        }.start()

    }

    private fun cocamokaPikaLoka(){
        gameadapterstime6 = object : CountDownTimer(1000, 1000) {
            override fun onTick(tothimysi: Long) {}
            override fun onFinish() {
                lotoGamerI(wildbberriiessBin.tubus8, R.id.tubus8, R.id.tubus3)
                wildbberriiessBin.tubus3.visibility = View.VISIBLE
                lotmotkot()
                popka2()
                gameadapterstime6?.cancel()
            }
        }.start()
    }

    private fun lotmotkot(){
        gameadapterstime7 = object : CountDownTimer(1200, 1200) {
            override fun onTick(kyimyi: Long) {}
            override fun onFinish() {
                lashishka()
                popka1()
            }
        }.start()
    }

    private fun lashishka() {
        wildbberriiessBin.tubus1.visibility = View.VISIBLE
        wildbberriiessBin.tubus13.visibility = View.VISIBLE
        wildbberriiessBin.tubus2.visibility = View.VISIBLE
        wildbberriiessBin.tubus5.visibility = View.GONE
        gameadapterstime7?.cancel()
        popka()
    }

    private fun SizeDipamides(dickPick: Int){
        val xyimyi = BrawlsEgypts.nextInt(3)
        if(dickPick==xyimyi && xyimyi==0){
            pinesMines()
        }
        if(dickPick==xyimyi && xyimyi==1){
            pinesMines2()
        }
        if(dickPick==xyimyi && xyimyi==2){
            pinesMines1()
        }
        if(dickPick!=xyimyi){
            when(xyimyi){
                0-> {
                    YouSuckMyDick1()
                }
                1-> {
                    YouSuckMyDick2()
                }
                2-> {
                    YouSuckMyDick3()
                }
            }
            wildbberriiessBin.tubus13.text = resources.getString(R.string.lose)
            oknomoeokno.otsosiMOIXYI.value = null
        }
        wildbberriiessBin.tubus12.setOnClickListener {
            (activity as LoadingsWindow).egipetBrawlsStars()
        }
        wildbberriiessBin.tubus12.visibility = View.VISIBLE
    }
    private fun pinesMines2() {
        wildbberriiessBin.tubus13.text = resources.getString(R.string.wins)
        wildbberriiessBin.tubus1.setImageDrawable(resources.getDrawable(R.drawable.losegrobnica))
        wildbberriiessBin.tubus2.setImageDrawable(resources.getDrawable(R.drawable.image))
        wildbberriiessBin.tubus3.setImageDrawable(resources.getDrawable(R.drawable.losegrobnica))
        popka()
    }
    private fun pinesMines() {
        wildbberriiessBin.tubus13.text = resources.getString(R.string.wins)
        wildbberriiessBin.tubus1.setImageDrawable(resources.getDrawable(R.drawable.image))
        wildbberriiessBin.tubus2.setImageDrawable(resources.getDrawable(R.drawable.losegrobnica))
        wildbberriiessBin.tubus3.setImageDrawable(resources.getDrawable(R.drawable.losegrobnica))
popka1()
    }
    private fun pinesMines1() {
        wildbberriiessBin.tubus13.text = resources.getString(R.string.wins)
        wildbberriiessBin.tubus1.setImageDrawable(resources.getDrawable(R.drawable.losegrobnica))
        wildbberriiessBin.tubus2.setImageDrawable(resources.getDrawable(R.drawable.losegrobnica))
        wildbberriiessBin.tubus3.setImageDrawable(resources.getDrawable(R.drawable.image))
popka2()
    }
    private fun YouSuckMyDick3() {
        wildbberriiessBin.tubus1.setImageDrawable(resources.getDrawable(R.drawable.losegrobnica))
        wildbberriiessBin.tubus2.setImageDrawable(resources.getDrawable(R.drawable.losegrobnica))
        wildbberriiessBin.tubus3.setImageDrawable(resources.getDrawable(R.drawable.image))
        wildbberriiessBin.tubus13.text = resources.getString(R.string.wins)
    popka3()
    }
    private fun YouSuckMyDick2() {
        wildbberriiessBin.tubus1.setImageDrawable(resources.getDrawable(R.drawable.losegrobnica))
        wildbberriiessBin.tubus2.setImageDrawable(resources.getDrawable(R.drawable.image))
        wildbberriiessBin.tubus3.setImageDrawable(resources.getDrawable(R.drawable.losegrobnica))
popka1()
    }

    private fun YouSuckMyDick1() {
        wildbberriiessBin.tubus1.setImageDrawable(resources.getDrawable(R.drawable.image))
        wildbberriiessBin.tubus2.setImageDrawable(resources.getDrawable(R.drawable.losegrobnica))
        wildbberriiessBin.tubus3.setImageDrawable(resources.getDrawable(R.drawable.losegrobnica))
popka()
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
            Toast.makeText(requireContext(), "No, koka lose", Toast.LENGTH_SHORT).show()
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
            Toast.makeText(requireContext(), "No, koka lose", Toast.LENGTH_SHORT).show()
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
            Toast.makeText(requireContext(), "No, koka lose", Toast.LENGTH_SHORT).show()
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
            Toast.makeText(requireContext(), "No, koka lose", Toast.LENGTH_SHORT).show()
        }
    }
}