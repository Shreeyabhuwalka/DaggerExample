package com.example.daggerexample.di;

import androidx.lifecycle.ViewModelProvider;

import com.example.daggerexample.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory modelProviderFactory);

    //same as upper function but since we are not doing anything inside function so we can use upper function which is more efficient in this case
//    @Provides
//    static ViewModelProvider.Factory bindFactory(ViewModelProviderFactory factory)
//    {
//        return factory;
//    }
}
