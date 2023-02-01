package com.moonton.mobile.gtgtgt

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.moonton.mobile.R
import com.moonton.mobile.gthugtgt.ViMod
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class FiiiirstFragment : Fragment() {
    private lateinit var frfhirfhirfhrf: Context

    val frrfnknbnthgthg by activityViewModel<ViMod>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiiiirst, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        frfhirfhirfhrf=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        frrfnknbnthgthg.frrbfrfbjbfr(frfhirfhirfhrf)

        frhurfrfgrfugrfgyufr()

    }

    private fun frhurfrfgrfugrfgyufr() {
        fryugrfggugrf()
    }

    private fun fryugrfggugrf() {
        findNavController().navigate(R.id.action_fiiiirstFragment_to_cooontntntntFragment)
    }
}