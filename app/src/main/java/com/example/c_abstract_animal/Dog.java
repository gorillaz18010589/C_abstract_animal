package com.example.c_abstract_animal;

import android.util.Log;

public class Dog extends Animal
{
    @Override
    String getName() {
        return "狗狗";
    }

    @Override
    void cry() {
        Log.v("hank","嗚嗚嗚");
    }

    @Override
    void run() {
        Log.v("hank","四隻腳飛奔～");
    }
}
