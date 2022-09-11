package com.patika.week3appnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.patika.week3appnavigation.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private lateinit var fragmentLoginBinding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentLoginBinding = FragmentLoginBinding.inflate(layoutInflater)
        return fragmentLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loginButtonNavigation() //Call For LoginButton
    }
    /**
     * Login Button that Navigates from Action_loginFragment to TwoFAFragment
     *
     */
    private fun loginButtonNavigation() {
        fragmentLoginBinding.apply {
            buttonLogin.setOnClickListener {
                findNavController().navigate(R.id.action_loginFragment_to_twoFAFragment)
            }
        }
    }
}

