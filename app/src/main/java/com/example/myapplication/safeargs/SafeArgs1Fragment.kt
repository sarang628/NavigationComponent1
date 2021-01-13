package com.example.myapplication.safeargs

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.myapplication.R
import com.example.myapplication.databinding.SafeArgs1FragmentBinding

class SafeArgs1Fragment : Fragment() {

    val args : SafeArgs1FragmentArgs by navArgs()

    companion object {
        fun newInstance() = SafeArgs1Fragment()
    }

    private lateinit var viewModel: SafeArgs1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.safe_args1_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SafeArgs1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewBinding = SafeArgs1FragmentBinding.bind(view)

        viewBinding.tvValue.text = args.myArg.toString()
    }

}