package com.example.jack.funbokkeeping.extensions

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.NavHostFragment

val FragmentManager.currentNavigationFragment: Fragment?
    get() = primaryNavigationFragment?.childFragmentManager?.fragments?.first()

fun FragmentManager.findNavHostFragment(@IdRes id: Int) = findFragmentById(id) as NavHostFragment
