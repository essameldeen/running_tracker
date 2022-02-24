package com.demo.runningtrackerapp.utils

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.demo.runningtrackerapp.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class CancelDialogFragment : DialogFragment() {

  private var listener: (() -> Unit)? = null

  fun setListener(listener: () -> Unit) {
    this.listener = listener
  }

  override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

    return MaterialAlertDialogBuilder(requireContext(), R.style.AlertDialogTheme)
      .setTitle("Cancel The Run ?")
      .setMessage("Are you sure to cancel the current run and delete all its data ?")
      .setIcon(R.drawable.ic_delete)
      .setPositiveButton("Yes") { _, _ ->
        listener?.let { yes ->
          yes.invoke()
        }

      }.setNegativeButton("No") { dialogInterface, _ ->
        dialogInterface.cancel()
      }
      .create()
  }

}