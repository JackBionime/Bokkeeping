package com.example.jack.funbokkeeping.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jack.funbokkeeping.FunApplication
import com.example.jack.funbokkeeping.resource.IResourceService
import com.example.jack.funroomdatabase.IDatabaseManager

abstract class BaseFragment : Fragment() {

    val databaseManager: IDatabaseManager by lazy {
        FunApplication.databaseManager
    }

    val resourceService: IResourceService by lazy {
        FunApplication.resourceService
    }

    abstract fun initView()

    abstract fun initParam()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView()
        initParam()
    }
}
