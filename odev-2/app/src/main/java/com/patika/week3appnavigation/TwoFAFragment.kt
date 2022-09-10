package com.patika.week3appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.patika.week3appnavigation.databinding.FragmentTwoFABinding


class TwoFAFragment : Fragment() {
    private lateinit var fragmentLoginBinding: FragmentTwoFABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentLoginBinding = FragmentTwoFABinding.inflate(layoutInflater)
        return fragmentLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        twoFAButtonNavigation() //Call For TwoFAButton
    }
    /**
     * 2FA AUTHENTICATION Button that Navigates from TwoFAScreen to dialogScreen
     *
     */
    private fun twoFAButtonNavigation() {
        fragmentLoginBinding.apply {
            button2fa.setOnClickListener {
                findNavController().navigate(R.id.action_twoFAFragment_to_dialogScreen)
            }
        }
    }
}
