package com.app.telehealthdoctor.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.app.telehealthdoctor.R
import com.app.telehealthdoctor.ui.activity.*
import kotlinx.android.synthetic.main.fragment_setting.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SettingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SettingFragment : Fragment(), View.OnClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_setting, container, false)

        view.add_insurance.setOnClickListener(this)
        view.feeManagement.setOnClickListener(this)
        view.btn_post_feeds.setOnClickListener(this)
        view.btn_ratingReview.setOnClickListener(this)
        view.btn_insurance.setOnClickListener(this)
        view.btn_manageFinance.setOnClickListener(this)
        view.btn_change_pass.setOnClickListener(this)

        view.btn_logOut.setOnClickListener(this)
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SettingFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SettingFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.add_insurance -> startActivity(Intent(activity, AddInsuranceActivity::class.java))
            R.id.feeManagement -> startActivity(Intent(activity, FeeManagementActivity::class.java))
            R.id.btn_post_feeds -> startActivity(Intent(activity, FeedsPostActivity::class.java))
            R.id.btn_ratingReview -> startActivity(Intent(activity, ReviewAndRatingActivity::class.java))
            R.id.btn_insurance -> startActivity(Intent(activity, InsuranceActivity::class.java))
            R.id.btn_manageFinance -> startActivity(Intent(activity, ManageFinanceActivity::class.java))
            R.id.btn_change_pass -> startActivity(Intent(activity, ChangePasswordActivity::class.java))

            R.id.btn_logOut -> startActivity(Intent(activity, LoginActivity::class.java))
        }
    }
}