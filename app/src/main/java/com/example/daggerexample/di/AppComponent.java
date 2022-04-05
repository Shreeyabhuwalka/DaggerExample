package com.example.daggerexample.di;

import android.app.Application;
import com.example.daggerexample.BaseApplication;
import javax.inject.Singleton;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

//(this tells dagger that this file should be in memory while time the application runs)
//AppComponent owns the singleton scope
@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class, ViewModelFactoryModule.class
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {

//    ActivityBuildersModule.AuthActivitySubcomponent.Factory authSubcomponent();

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}
