package com.example.medicare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class WelcomeFragment extends Fragment {

    public WelcomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);

        Button btnLogin = view.findViewById(R.id.btnLogin);
        Button btnSignUp = view.findViewById(R.id.btnSignUp);

        btnLogin.setOnClickListener(v -> {
            getActivity().getSupportFragmentManager().beginTransaction()
            .replace(R.id.fragment_container, new LoginFragment())
            .addToBackStack(null)
            .commit();
        });

        btnSignUp.setOnClickListener(v -> {
            getActivity().getSupportFragmentManager().beginTransaction()
            .replace(R.id.fragment_container, new SignupFragment())
            .addToBackStack(null)
            .commit();
        });

        return view;
    }
}
