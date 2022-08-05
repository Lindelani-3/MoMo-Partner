package com.developerdiindy.momopartner.presentation.home.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.presentation.appuser.SettingsActivity;
import com.developerdiindy.momopartner.presentation.home.HomeActivity;
import com.developerdiindy.momopartner.presentation.requesttopay.RequestDetailsActivity;
import com.developerdiindy.momopartner.presentation.requesttopay.SelectPayerActivity;
import com.developerdiindy.momopartner.presentation.transfer.SelectPayeeActivity;
import com.developerdiindy.momopartner.presentation.transfer.TransferDetailsActivity;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        setupButtons(view);

        return view;
    }

    private void setupButtons(View view) {
        Button btnTransfer = (Button) view.findViewById(R.id.btn_transfer_home);
        Button btnRequest = (Button) view.findViewById(R.id.btn_reqToPay_home);

        // transfer
        btnTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToTransfer();
            }
        });

        // request
        btnRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRequestPay();
            }
        });
    }

    private void goToRequestPay() {
        startActivity(new Intent(getActivity(), SelectPayerActivity.class));
    }

    private void goToTransfer() {
        startActivity(new Intent(getActivity(), SelectPayeeActivity.class));
    }
}