package com.ktd.zinovyev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ktd.zinovyev.databinding.FragmentLoginBinding;


public class Login extends Fragment {

   private FragmentLoginBinding __binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       __binding=FragmentLoginBinding.inflate(inflater,container,false);

       __binding.button2.setOnClickListener(view -> {
           String email = __binding.editTextTextEmailAddress.getText().toString();
           String login = __binding.editTextTextPassword.getText().toString();
           if(login.equals("admin") && email.equals("admin"))
           Navigation.findNavController(view).navigate(R.id.action_login_to_password);});
        __binding.Reg.setOnClickListener(view -> {Navigation.findNavController(view).navigate(R.id.action_login_to_registration);});
        // Inflate the layout for this fragment
        return __binding.getRoot();
    }
}