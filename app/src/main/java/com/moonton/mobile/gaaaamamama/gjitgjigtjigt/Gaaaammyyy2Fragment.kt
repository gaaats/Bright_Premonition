package com.moonton.mobile.gaaaamamama.gjitgjigtjigt

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.moonton.mobile.R
import com.moonton.mobile.databinding.FragmentGaaaammyyy2Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


class Gaaaammyyy2Fragment : Fragment() {
    val fnfrfrnfrjfrnjrf by lazy {
        mapOf(
            1 to ContextCompat.getDrawable(requireActivity(), R.drawable.frjirfijjijrf),
            2 to ContextCompat.getDrawable(requireActivity(), R.drawable.fnrfn),
            3 to ContextCompat.getDrawable(requireActivity(), R.drawable.frrfnjfrnjrf),
            4 to ContextCompat.getDrawable(requireActivity(), R.drawable.four),
            5 to ContextCompat.getDrawable(requireActivity(), R.drawable.gthyhyhy),
            6 to ContextCompat.getDrawable(requireActivity(), R.drawable.sixofdiamondsfrgtgt),
            7 to ContextCompat.getDrawable(requireActivity(), R.drawable.sevenggtgtgtgt),
            8 to ContextCompat.getDrawable(requireActivity(), R.drawable.gtgttggt),
            9 to ContextCompat.getDrawable(requireActivity(), R.drawable.frrfkjrfjiorfjrf),
            10 to ContextCompat.getDrawable(requireActivity(), R.drawable.frrfgt),
            11 to ContextCompat.getDrawable(requireActivity(), R.drawable.gtgtgthyhy),
        )
    }

    val rfjrfjrfrfjrfrfjii by lazy {
        listOf(
            frfrfgrfgrfgrfyfgry.imgCard1,
            frfrfgrfgrfgrfyfgry.imgCard2,
            frfrfgrfgrfgrfyfgry.imgCard3,
            frfrfgrfgrfgrfyfgry.imgCard4,
            frfrfgrfgrfgrfyfgry.imgCard5,
        )
    }

    var frrfrfgrfygfrgrfgyurf = 0
    var jrrfjrfjifrjrfji = Random.nextInt(from = 100, until = 1000)

    var rfbgbgtbgtbgtbhjtg = 0

    private var frrfrfrfhurf: FragmentGaaaammyyy2Binding? = null
    private val frfrfgrfgrfgrfyfgry
        get() = frrfrfrfhurf ?: throw RuntimeException("FragmentGameeBinding = null")


    private fun frrfgrgrfggfr() {
        Snackbar.make(
            frfrfgrfgrfgrfyfgry.root,
            "Error, error, error",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        frrfrfrfhurf = FragmentGaaaammyyy2Binding.inflate(inflater, container, false)
        return frfrfgrfgrfgrfyfgry.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            frfrfgrfgrfgrfyfgry.root.background.alpha = 220

            frfrfgrfgrfgrfyfgry.btnImgClose.setOnClickListener {
                requireActivity().finish()
            }

            gtddeffedfedfed()

            frfrfgrfgrfgrfyfgry.tvUserPointsCount.text = rfbgbgtbgtbgtbhjtg.toString()

            frfrfgrfgrfgrfyfgry.btnTakeCard.setOnClickListener {
                lifecycleScope.launch {
                    frfrfgrfgrfgrfyfgry.btnTakeCard.alpha = 0.2f
                    frfrfgrfgrfgrfyfgry.btnTakeCard.isEnabled = false
                    frfrfgrfgrfgrfyfgry.btnTakeCard.isPressed = true
                    val randomCard = fnfrfrnfrjfrnjrf.keys.shuffled().random()
                    val imageCard = fnfrfrnfrjfrnjrf[randomCard]

                    frrfbrfbrfhgtgth(imageCard)

                    rfbgbgtbgtbgtbhjtg = rfbgbgtbgtbgtbhjtg + randomCard
                    frfrfgrfgrfgrfyfgry.tvUserPointsCount.text = rfbgbgtbgtbgtbhjtg.toString()
                    delay(600)



                    if (rfbgbgtbgtbgtbhjtg >21){
                        Snackbar.make(
                            frfrfgrfgrfgrfyfgry.root,
                            "You lose $jrrfjrfjifrjrfji$. Try again",
                            Snackbar.LENGTH_LONG
                        ).show()

                        frrfrfgrfygfrgrfgyurf = frrfrfgrfygfrgrfgyurf - jrrfjrfjifrjrfji


                        delay(1000)
                        frfrfgrfgrfgrfyfgry.btnTakeCard.isEnabled = true
                        frfrfgrfgrfgrfyfgry.btnTakeCard.isPressed = false
                        frfrfgrfgrfgrfyfgry.btnTakeCard.alpha = 1.0f
                        findNavController().navigate(R.id.action_gaaaammyyy2Fragment_to_gaaaaamy3Fragment)
                    }
                    if (rfbgbgtbgtbgtbhjtg ==21){
                        Snackbar.make(
                            frfrfgrfgrfgrfyfgry.root,
                            "You WIN ${jrrfjrfjifrjrfji}$",
                            Snackbar.LENGTH_LONG
                        ).show()

                        frrfrfgrfygfrgrfgyurf = frrfrfgrfygfrgrfgyurf + jrrfjrfjifrjrfji

                        delay(1000)
                        frfrfgrfgrfgrfyfgry.btnTakeCard.isEnabled = true
                        frfrfgrfgrfgrfyfgry.btnTakeCard.isPressed = false
                        frfrfgrfgrfgrfyfgry.btnTakeCard.alpha = 1.0f
                        findNavController().navigate(R.id.action_gaaaammyyy2Fragment_to_gaaaaamy3Fragment)
                    }
                    delay(500)
                    frfrfgrfgrfgrfyfgry.btnTakeCard.isEnabled = true
                    frfrfgrfgrfgrfyfgry.btnTakeCard.isPressed = false
                    frfrfgrfgrfgrfyfgry.btnTakeCard.alpha = 1.0f

                }
            }

            frfrfgrfgrfgrfyfgry.btnImgRules.setOnClickListener {
                Snackbar.make(
                    frfrfgrfgrfgrfyfgry.root,
                    "Collect 21 points!",
                    Snackbar.LENGTH_LONG
                ).show()
            }

        } catch (e: Exception) {
            frrfgrgrfggfr()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun frrfbrfbrfhgtgth(imageCard: Drawable?) {
        for (i in rfjrfjrfrfjrfrfjii) {
            if (i.contentDescription == "empty") {
                i.setImageDrawable(imageCard)
                i.contentDescription = "card"
                return
            }
        }
    }

    override fun onDestroy() {
        frrfrfrfhurf = null
        super.onDestroy()
    }

    override fun onPause() {
        gtddeffedfedfed()
        super.onPause()
    }

    private fun gtddeffedfedfed() {
        for (i in rfjrfjrfrfjrfrfjii) {
            i.contentDescription = "empty"
            i.setImageDrawable(ContextCompat.getDrawable(requireActivity(), R.drawable.sssss))
        }
    }
}