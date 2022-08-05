package com.developerdiindy.momopartner.presentation.home.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.presentation.requesttopay.RequestDetailsActivity;
import com.developerdiindy.momopartner.presentation.requesttopay.SelectPayerActivity;
import com.developerdiindy.momopartner.presentation.transfer.TransferDetailsActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RequestPayFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RequestPayFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RequestPayFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RequestPayFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RequestPayFragment newInstance(String param1, String param2) {
        RequestPayFragment fragment = new RequestPayFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_request_pay, container, false);
        setupButtons(view);
        return view;
    }

    private void setupButtons(View view) {
        Button btnRequest = (Button) view.findViewById(R.id.btn_reqToPay_fragment);
        btnRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(view.getContext(), SelectPayerActivity.class));
            }
        });
    }
}