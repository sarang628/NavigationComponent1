package com.example.myapplication.safeargs

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.compose.NavHost
import androidx.navigation.fragment.NavHostFragment
import com.example.myapplication.R
import com.example.myapplication.databinding.SafeArgsFragmentBinding

class SafeArgsFragment : Fragment() {

    companion object {
        fun newInstance() = SafeArgsFragment()
    }

    private lateinit var viewModel: SafeArgsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.safe_args_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SafeArgsViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = SafeArgsFragmentBinding.bind(view)

        binding.btn.setOnClickListener {
            val action = SafeArgsFragmentDirections.actionSafeArgsFragmentToSafeArgs1Fragment(123)
            NavHostFragment.findNavController(this).navigate(R.id.action_safeArgsFragment_to_safeArgs1Fragment)
        }
    }

}