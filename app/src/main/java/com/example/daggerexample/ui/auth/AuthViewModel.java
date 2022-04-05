package com.example.daggerexample.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.daggerexample.network.auth.AuthApi;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {
    public static final String TAG = "AuthViewModel";
    private AuthApi authApi;
    
    @Inject
    public AuthViewModel(AuthApi authApi){
        this.authApi = authApi;
        Log.i(TAG, "AuthViewModel: viewmodel is working....");
        
        if (this.authApi == null){
            Log.d(TAG, "AuthViewModel: auth api is null");
        }
        else{
            Log.d(TAG, "AuthViewModel: auth api is not null");
        }
    }
}
