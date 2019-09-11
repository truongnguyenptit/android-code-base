package com.trainingdeveloperpro.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import com.trainingdeveloperpro.common.base.BaseFragment
import com.trainingdeveloperpro.common.base.BaseViewModel
import com.trainingdeveloperpro.home.databinding.FragmentHomeBinding
import com.trainingdeveloperpro.home.views.HomeAdapter
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * A simple [BaseFragment] subclass
 * that will show a list of top [User] from Github's API.
 */
class HomeFragment : BaseFragment() {

    // FOR DATA
    private val viewModel: HomeViewModel by viewModel()
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        configureRecyclerView()
    }

    override fun getViewModel(): BaseViewModel = viewModel

    // ---

    private fun configureRecyclerView() {
        binding.fragmentHomeRv.adapter = HomeAdapter(viewModel)
    }
}
