package com.patika.week3appnavigation

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController

class DialogScreen : DialogFragment() {
    /**
     * Dialog screen that navigates to MainActivity if user approved authentication
     * Clears backstack after navigate -
     */
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage("You are about to login")
                .setPositiveButton("OK") { dialog, id ->
                    findNavController().apply {
                        navigate(R.id.action_dialogScreen_to_homeActivity)
                        //code for cleaning all backstack 
                        activity?.finishAffinity()
                    }
                }
                .setNegativeButton("Cancel", { dialog, id ->
                })
            builder.create()
        } ?: throw IllegalStateException("activity can not be null")
    }
}
