package com.app.telehealthdoctor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.app.telehealthdoctor.ui.AppointmentFragment
import com.app.telehealthdoctor.ui.AvailabilityFragment
import com.app.telehealthdoctor.ui.HomeFragment
import com.app.telehealthdoctor.ui.SettingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setCurrentFragment(HomeFragment())
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> setCurrentFragment(HomeFragment())
                R.id.appointment -> setCurrentFragment(AppointmentFragment())
                R.id.availability -> setCurrentFragment(AvailabilityFragment())
                R.id.setting -> setCurrentFragment(SettingFragment())
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
}