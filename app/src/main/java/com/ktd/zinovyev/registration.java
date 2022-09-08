package com.ktd.zinovyev;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ktd.zinovyev.databinding.FragmentLoginBinding;
import com.ktd.zinovyev.databinding.FragmentRegistrationBinding;


public class registration extends Fragment {


    private FragmentRegistrationBinding __bindingReg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        __bindingReg=FragmentRegistrationBinding.inflate(inflater,container,false);
        __bindingReg.button3.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.action_registration_to_login);});
        // Inflate the layout for this fragment
        return __bindingReg.getRoot();
    }
}