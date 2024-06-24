package com.example.projectclicnt.View.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.projectclicnt.View.Fragment.AllFragment
import com.example.projectclicnt.View.Fragment.HealthBeaFragment
import com.example.projectclicnt.View.Fragment.HealthBeautyFragment
import com.example.projectclicnt.View.Fragment.WomenFashionFragment

internal class TabAdapter(var context:Context,fragmentManager: FragmentManager, var totalTabs:Int):FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {

        return when(position){
            0->{
                AllFragment()
            }
            1->{
                WomenFashionFragment()
            }
            2->{
                HealthBeautyFragment()
            }
            3->{
                HealthBeaFragment()
            }
            else-> getItem(position)
        }

    }

    override fun getCount(): Int {
    return totalTabs
    }
}