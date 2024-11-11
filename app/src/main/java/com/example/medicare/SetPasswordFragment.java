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

public class SetPasswordFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_set_password, container, false);

        ImageButton backArrow = view.findViewById(R.id.backArrow);

        backArrow.setOnClickListener(v -> {
            FragmentManager fragmentManager = getParentFragmentManager();
            if (fragmentManager.getBackStackEntryCount() > 0) {
                fragmentManager.popBackStack();
            }
        });

        ImageButton eyeIcon1 = view.findViewById(R.id.eyeIcon1);
        EditText passwordInput1 = view.findViewById(R.id.passwordInput1);

        eyeIcon1.setOnClickListener(v -> {
            if (passwordInput1.getTransformationMethod() instanceof PasswordTransformationMethod) {
                passwordInput1.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                passwordInput1.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });

        ImageButton eyeIcon2 = view.findViewById(R.id.eyeIcon2);
        EditText passwordInput2 = view.findViewById(R.id.passwordInput2);

        eyeIcon2.setOnClickListener(v -> {
            if (passwordInput2.getTransformationMethod() instanceof PasswordTransformationMethod) {
                passwordInput2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                passwordInput2.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        });

        return view;
    }
}