package com.example.hikoyalar;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment_a extends Fragment {

    SharedPreferences sharedPreferences;
    EditText username, email, pass, phone;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        username = view.findViewById(R.id.edit_wUsername);
        email = view.findViewById(R.id.edit_wEmail);
        pass = view.findViewById(R.id.edit_wPassword);
        phone = view.findViewById(R.id.edit_wPhone);

        sharedPreferences = requireActivity().getSharedPreferences("Naveen", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("Username", "");
        String mail = sharedPreferences.getString("Email", "");
        String pwd = sharedPreferences.getString("Password", "");
        String ph = sharedPreferences.getString("Phone", "");

        username.setText(name);
        email.setText(mail);
        pass.setText(pwd);
        phone.setText(ph);
    }
}
