package com.trainingdeveloperpro.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.navArgs
import com.trainingdeveloperpro.common.base.BaseFragment
import com.trainingdeveloperpro.common.base.BaseViewModel
import com.trainingdeveloperpro.detail.R
import com.trainingdeveloperpro.detail.databinding.FragmentDetailBinding
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * A simple [BaseFragment] subclass
 * that will show the [User] details.
 */
class DetailFragment : BaseFragment() {

    // FOR DATA
    private val viewModel: DetailViewModel by viewModel()
    private lateinit var binding: FragmentDetailBinding


    private val args: DetailFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.loadDataWhenActivityStarts(args.login)


    }

    override fun getViewModel(): BaseViewModel = viewModel

    override fun getExtras(): FragmentNavigator.Extras =
        FragmentNavigatorExtras(binding.fragmentDetailAvatar to getString(R.string.transition_avatar_dest))
}
