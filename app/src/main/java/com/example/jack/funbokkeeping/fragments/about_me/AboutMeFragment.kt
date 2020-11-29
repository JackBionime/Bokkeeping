package com.example.jack.funbokkeeping.fragments.about_me

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jack.funbokkeeping.R
import com.example.jack.funbokkeeping.base.BaseFragment

class AboutMeFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_about_me, container, false)
    }

    override fun initView() {
    }

    override fun initParam() {
    }
}
