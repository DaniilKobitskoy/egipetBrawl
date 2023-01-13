package com.brawlegypt.edyptianbrawl.fragmentsgame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.brawlegypt.edyptianbrawl.ifuckyourass
import com.brawlegypt.edyptianbrawl.databinding.FragmentViewminigame1Binding


class viewminigame1 : Fragment() {
    private var pines : FragmentViewminigame1Binding? = null
    private val pusies get() = pines
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        pines = FragmentViewminigame1Binding.inflate(inflater, container, false)
        return pusies!!.root
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
        pusies!!.button3.setOnClickListener {
            var pines = gameEgipt()
            var pussies = requireFragmentManager().beginTransaction()
            pussies.replace(ifuckyourass.viewPagerContainer.id, pines)
            pussies.commit()


        }
        pusies!!.button4.setOnClickListener {
            Toast.makeText(context, "Lose", Toast.LENGTH_SHORT).show()
            popka1()
            popka2()
        }
        pusies!!.button5.setOnClickListener {
            Toast.makeText(context, "Lose", Toast.LENGTH_SHORT).show()
            popka3()
            popka()
        }
    }
    companion object {

        @JvmStatic
        fun newInstance() = viewminigame1()
    }
}