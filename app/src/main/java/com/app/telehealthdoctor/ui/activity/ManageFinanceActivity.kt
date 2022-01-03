package com.app.telehealthdoctor.ui.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.app.telehealthdoctor.R
import com.app.telehealthdoctor.ui.fragments.RevenueFrag
import com.app.telehealthdoctor.ui.fragments.TransactionFrag
import kotlinx.android.synthetic.main.activity_manage_finance.*

class ManageFinanceActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_finance)
        tv_revenue.setOnClickListener(this)
        tv_transaction.setOnClickListener(this)
        setCurrentFragment(RevenueFrag())
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.tv_revenue -> {
                tv_transaction.setBackgroundResource(0)
                tv_transaction.setTextColor(resources.getColor(R.color.white))
                tv_revenue.setBackgroundResource(R.drawable.back_white)
                tv_revenue.setTextColor(resources.getColor(R.color.main_color))
                setCurrentFragment(RevenueFrag())
            }
            R.id.tv_transaction -> {
                tv_revenue.setBackgroundResource(0)
                tv_revenue.setTextColor(resources.getColor(R.color.white))
                tv_transaction.setBackgroundResource(R.drawable.back_white)
                tv_transaction.setTextColor(resources.getColor(R.color.main_color))
                setCurrentFragment(TransactionFrag())
            }

        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.finance_container, fragment)
            commit()
        }
}