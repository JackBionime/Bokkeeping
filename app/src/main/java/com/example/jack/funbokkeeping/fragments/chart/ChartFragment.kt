package com.example.jack.funbokkeeping.fragments.chart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jack.funbokkeeping.R
import com.example.jack.funbokkeeping.base.BaseFragment

class ChartFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chart, container, false)
    }

    override fun initView() {
    }

    override fun initParam() {
    }
}
