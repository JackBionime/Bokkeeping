package com.example.jack.funbokkeeping.fragments.diary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jack.funbokkeeping.R
import com.example.jack.funbokkeeping.base.BaseFragment

class DiaryFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_diary, container, false)
    }

    override fun initView() {
    }

    override fun initParam() {
    }
}
