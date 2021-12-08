package com.example.c_abstract_animal;

import android.util.Log;

public class Cat extends Animal {
    @Override
    String getName() {
        return "貓";
    }

    @Override
    void cry() {
        Log.v("hank","咪喵哭");
    }

    @Override
    void run() {
        Log.v("hank","飛簷走壁");
    }
}
