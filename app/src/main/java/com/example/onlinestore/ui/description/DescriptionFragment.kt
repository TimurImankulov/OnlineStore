package com.example.onlinestore.ui.description

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.onlinestore.R
import com.example.onlinestore.data.common.BaseFragment
import com.example.onlinestore.databinding.FragmentDescriptionBinding
import com.example.onlinestore.utils.ext.viewBinding

class DescriptionFragment : BaseFragment() {
    override fun resID() = R.layout.fragment_description
    private val binding by viewBinding(FragmentDescriptionBinding::bind)
    private val args: DescriptionFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListeners()
        setupViews()
    }

    private fun setupViews() {
        binding.tvDescription.text = args.details
    }

    private fun setupListeners() {
        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}