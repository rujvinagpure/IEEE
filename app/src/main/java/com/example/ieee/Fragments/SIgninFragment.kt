package com.example.ieee.Fragments

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.view.isVisible
import com.example.ieee.R
class SIgninFragment : Fragment() {

    lateinit var signinthing:LinearLayout
    lateinit var signupthing:LinearLayout
    lateinit var signupbtn:Button
    lateinit var signinButton:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_s_ignin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signinthing = view.findViewById(R.id.signinthing)
        signupthing = view.findViewById(R.id.signupthing)

        signupbtn = view.findViewById(R.id.signup)
        signinButton = view.findViewById(R.id.signyup)

        signinButton.setOnClickListener {
            val animationFadeOut = AnimationUtils.loadAnimation(context, R.anim.fade_out)
            val animationFadein = AnimationUtils.loadAnimation(context, R.anim.fade_in)
            signupthing.startAnimation(animationFadeOut)
            signinthing.startAnimation(animationFadein)

            Handler().postDelayed({
                signinthing.visibility = View.VISIBLE
                signupthing.visibility = View.GONE
            }, 1000)
        }
         signupbtn.setOnClickListener {
             val animationFadeOut = AnimationUtils.loadAnimation(context, R.anim.fade_out)
             val animationFadein = AnimationUtils.loadAnimation(context, R.anim.fade_in)
             signinthing.startAnimation(animationFadeOut)
             signupthing.startAnimation(animationFadein)

             Handler().postDelayed({
                 signupthing.visibility = View.VISIBLE
                 signinthing.visibility = View.GONE
             }, 1000)
        }



    }
}