package com.patika.week3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.patika.week3.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //call for button method
        setTextViewButton()
    }
    /**
     * If savedInstanceState Not Null
     * Get TextView Data From Bundle
     *Sets TextView from restored data.
     * @param savedInstanceState
     */
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        if (savedInstanceState != null) {
            binding.textView.text = savedInstanceState.getString("USER_TEXT", "DEFAULT VAL")
        }
    }
    /**
     * Saves TextView Data To Bundle
     *
     * @param outState
     */
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("USER_TEXT", binding.textView.text.toString())
    }
    /**
     * Sets TextView to userInputText
     *
     */
    private fun setTextViewButton(){
        binding.button.setOnClickListener {
            binding.textView.text = binding.userInputText.text.toString()
        }
    }
}

