package com.modalapp;
import android.app.Application;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.defaults.DefaultReactNativeHost;
import com.facebook.soloader.SoLoader;
import java.util.List;
//import com.mini2.ReactNativeActivity;
import com.example.frag_int.IntegrationActivity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Hashtable;
import android.content.Intent;
import java.io.*;
import android.app.Activity;
import android.content.res.Resources;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Handler;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.Promise;

public class Mini extends ReactContextBaseJavaModule {
    private ReactApplicationContext reactAppContext;
    int navigationBarHeight;
    float density;

    Mini(ReactApplicationContext context) {
        super(context);
        this.reactAppContext = context;
        Resources resources = reactAppContext.getResources();
    }

    @Override
    public String getName() {
        return "Mini";
    }

    

    @ReactMethod
    public void navigateToScreen(Promise promise) {
        // Code to navigate to the specified screen     
        System.out.println(getReactApplicationContext());
        Intent intent = new Intent(getReactApplicationContext(), IntegrationActivity.class);
        getReactApplicationContext().getCurrentActivity().startActivity(intent);
    }


    @ReactMethod
    public void createEventPromise(Promise promise) {
        com.facebook.react.bridge.ReactApplicationContext context=getReactApplicationContext();
         try {
            promise.resolve(getReactApplicationContext());
        } catch(Exception e) {
            promise.reject("Create Event Error", e);
        }
    }
    
    @ReactMethod
    public void getName(Callback callback) {
        // Return the name as a callback
        callback.invoke(getName());
    }
  
}

