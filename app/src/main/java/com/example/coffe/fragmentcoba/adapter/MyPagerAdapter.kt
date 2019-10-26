package com.example.coffe.fragmentcoba.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.coffe.fragmentcoba.fragment.FirstFragment
import com.example.coffe.fragmentcoba.fragment.SecondFragment
import com.example.coffe.fragmentcoba.fragment.ThirdFragment

class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){

    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
        FirstFragment(),
        SecondFragment(),
        ThirdFragment()
    )

    // menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Home"
            1 -> "List Sport"
            else -> "Third Tab"
        }
    }
}