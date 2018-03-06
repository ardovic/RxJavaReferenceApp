package com.ardovic.rxjavareferenceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import org.reactivestreams.Subscription;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Observable<String> myObservable = Observable.just("Hello");

        Observer<String> myObserver = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(String s) {
                Log.d("HEX", s);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };

        myObservable.subscribe(myObserver);

    }
}
