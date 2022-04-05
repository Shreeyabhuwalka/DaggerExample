package com.example.daggerexample.di;

import com.example.daggerexample.di.auth.AuthViewModelsModule;
import com.example.daggerexample.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {


    //potential client to inject dependency to it
   @ContributesAndroidInjector( modules = {
                   AuthViewModelsModule.class} )
   abstract AuthActivity contributeAuthActivity();



}
