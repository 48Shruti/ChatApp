package com.shruti.chatapp

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.shruti.chatapp.databinding.CustomDialogFragmentBinding

interface dialogClickInterface{
    fun dialogName(name : String)
}
class DialogAdapter : DialogFragment() {
    lateinit var binding: CustomDialogFragmentBinding
    lateinit var dialogClass : Dialog
    lateinit var dialogClickInterface: dialogClickInterface
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        dialogClass = Dialog(requireContext())
        binding  = CustomDialogFragmentBinding.inflate(layoutInflater)
        dialogClass.setContentView(binding.root)
        binding.btnme.setOnClickListener {

        }
        binding.btngroups.setOnClickListener {

        }
        binding.btnother.setOnClickListener {

        }
        return dialogClass
    }
    companion object{
        var TAG = this::class.java.canonicalName
    }

}