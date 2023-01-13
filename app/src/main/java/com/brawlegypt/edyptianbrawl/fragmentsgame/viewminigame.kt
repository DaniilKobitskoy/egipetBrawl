package com.brawlegypt.edyptianbrawl.fragmentsgame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.brawlegypt.edyptianbrawl.ifuckyourass
import com.brawlegypt.edyptianbrawl.databinding.FragmentViewminigameBinding


class viewminigame : Fragment() {
    private var xyipizda : FragmentViewminigameBinding? = null
    private val tyzmalafia get() = xyipizda
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        xyipizda = FragmentViewminigameBinding.inflate(inflater, container, false)
        return tyzmalafia!!.root
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
        tyzmalafia!!.imageButton2.setOnClickListener {
            var pines = viewminigame1()
            var pussies = requireFragmentManager().beginTransaction()
            pussies.replace(ifuckyourass.viewPagerContainer.id, pines)
            pussies.commit()
popka()

        }
        tyzmalafia!!.imageButton3.setOnClickListener {
popka1()
            Toast.makeText(context, "Lose", Toast.LENGTH_SHORT).show()

        }
        tyzmalafia!!.imageButton4.setOnClickListener {
popka2()
            Toast.makeText(context, "Lose", Toast.LENGTH_SHORT).show()

        }
        tyzmalafia!!.imageButton5.setOnClickListener {
popka3()
            Toast.makeText(context, "Lose", Toast.LENGTH_SHORT).show()

        }
    }
    companion object {

        @JvmStatic
        fun newInstance() =
            viewminigame()

    }
}