package com.example.daggerexample.ui.auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.RequestManager;
import com.example.daggerexample.R;
import com.example.daggerexample.viewmodels.ViewModelProviderFactory;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {

    private static final String TAG = "AuthActivity";
//    @Inject
//    String dfg;
//
//    @Inject
//    boolean isAppNull;
//
//    @Inject
//    int check;
    private AuthViewModel viewModel;
    @Inject
    ViewModelProviderFactory providerFactory;

    @Inject
    Drawable logo;

    @Inject
    RequestManager requestManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        viewModel = ViewModelProviders.of(this,providerFactory).get(AuthViewModel.class);

        setLogo();
//        Log.i(TAG, "onCreate: "+dfg);
//        Log.i(TAG, "onCreate: "+isAppNull);
//        Log.i(TAG, "onCreate: "+check);
    }

    private void setLogo(){
        requestManager.load(logo)
                .into((ImageView) findViewById(R.id.login_logo));
    }

}