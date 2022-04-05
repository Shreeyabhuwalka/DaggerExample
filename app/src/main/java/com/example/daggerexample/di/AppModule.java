package com.example.daggerexample.di;

import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.daggerexample.R;
import com.example.daggerexample.util.Constants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {

    @Singleton
    @Provides
    static Retrofit provideRetrofitInstance(){
        return new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    static RequestOptions provideRequestOptions(){
        return RequestOptions.placeholderOf(R.drawable.white_background)
                .error(R.drawable.white_background);
    }

    @Singleton
    @Provides
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions){
        return Glide.with(application)
                .setDefaultRequestOptions(requestOptions);
    }

    @Singleton
    @Provides
    static Drawable providerAppDrawable(Application application){
        return ContextCompat.getDrawable(application,R.drawable.logo);
    }


//    @Provides
//    static String someString(){
//        return "this is a test string";
//    }
//
//    //beacse of binding this function will return false
//    @Provides
//    static boolean getApp(Application application)
//    {
//        return application==null;
//    }
//
//    //this will return 1 as by default it gets val ...
//    @Provides
//    static int someInt(String string){
//        if(string.equals("this is a test string"))
//            return 1;
//        else
//            return 0;
//    }
}
