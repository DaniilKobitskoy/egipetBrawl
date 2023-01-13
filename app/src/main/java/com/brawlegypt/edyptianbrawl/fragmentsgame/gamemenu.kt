package com.brawlegypt.edyptianbrawl.fragmentsgame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.brawlegypt.edyptianbrawl.ifuckyourass
import com.brawlegypt.edyptianbrawl.databinding.FragmentGamemenuBinding


class gamemenu : Fragment() {
    private var pines : FragmentGamemenuBinding? = null
    private val pussies get() = pines
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        pines = FragmentGamemenuBinding.inflate(inflater, container, false)
        return pussies!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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
        pussies!!.button2.setOnClickListener {

            var pinesYou = viewminigame()
            var pussi = requireFragmentManager().beginTransaction()
            pussi.replace(ifuckyourass.viewPagerContainer.id, pinesYou)
            pussi.commit()
            popka()
            popka1()
            popka2()
            popka3()

        }

    }
    companion object {

        @JvmStatic
        fun newInstance() = gamemenu()

    }
}