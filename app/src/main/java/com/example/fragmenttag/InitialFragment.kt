package com.example.fragmenttag

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.initial_fragment.*


class InitialFragment : Fragment() {

    companion object {
        fun newInstance() = InitialFragment()
    }

    private lateinit var viewModel: InitialViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.initial_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(InitialViewModel::class.java)

        destination.setOnClickListener {
            findNavController().navigate(InitialFragmentDirections.actionInitialFragmentToDestinationFragment())
        }
    }

}
