package com.app.telehealthdoctor.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.telehealthdoctor.R
import com.app.telehealthdoctor.ui.adaptors.TrasanctionAdaptor
import kotlinx.android.synthetic.main.fragment_transaction.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TransactionFrag.newInstance] factory method to
 * create an instance of this fragment.
 */
class TransactionFrag : Fragment() {
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
        val view: View = inflater.inflate(R.layout.fragment_transaction, container, false)
        setUpTransactionAdaptor(view)
        return view
    }

    private fun setUpTransactionAdaptor(view: View) {
        view.rv_transaction.layoutManager = LinearLayoutManager(activity)
        view.rv_transaction.adapter = TrasanctionAdaptor()
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TransactionFrag().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}