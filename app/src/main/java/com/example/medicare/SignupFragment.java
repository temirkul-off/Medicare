    package com.example.medicare;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class SignupFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signup, container, false);

        ImageButton backArrow = view.findViewById(R.id.backArrow);

        backArrow.setOnClickListener(v -> {
            FragmentManager fragmentManager = getParentFragmentManager();
            if (fragmentManager.getBackStackEntryCount() > 0) {
                fragmentManager.popBackStack();
            }
        });

        ImageButton eyeIcon = view.findViewById(R.id.eyeIcon);
        EditText passwordInput = view.findViewById(R.id.passwordInput);

        eyeIcon.setOnClickListener(v -> {
            if (passwordInput.getTransformationMethod() instanceof PasswordTransformationMethod) {
                passwordInput.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                passwordInput.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });

        TextView signupButton = view.findViewById(R.id.logInButton);
        signupButton.setOnClickListener(v -> {
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new LoginFragment())
                    .addToBackStack(null)
                    .commit();
        });

        return view;
    }
}