package com.brawlegypt.edyptianbrawl.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.brawlegypt.edyptianbrawl.egyptload


abstract class adapters<T : ViewBinding>(private val bindingInflater: (LI: LayoutInflater) -> T) :
    Fragment() {



    private var walberries: T? = null
    protected lateinit var oknomoeokno: egyptload
    protected val wildbberriiessBin get() = walberries!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        walberries = bindingInflater.invoke(inflater)
        return wildbberriiessBin.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        oknomoeokno = ViewModelProvider(requireActivity())[egyptload::class.java]
        webViewOpenGameAzart()

    }




    override fun onDestroyView() {
        super.onDestroyView()
        walberries = null
    }



    override fun onDestroy() {
        super.onDestroy()
        walberries = null
    }



    abstract fun webViewOpenGameAzart()

}