package com.trainingdeveloperpro.home.views

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.trainingdeveloperpro.home.HomeViewModel
import com.trainingdeveloperpro.home.databinding.ItemHomeBinding
import com.trainingdeveloperpro.model.User

class HomeViewHolder(parent: View): RecyclerView.ViewHolder(parent) {

    private val binding = ItemHomeBinding.bind(parent)

    fun bindTo(user: User, viewModel: HomeViewModel) {
        binding.user = user
        binding.viewmodel = viewModel
    }
}