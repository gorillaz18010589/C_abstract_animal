package com.example.c_abstract_animal;

import android.util.Log;

public class Hero {
    private Animal animal;


    public void attack(){
       if(animal == null){
           Log.v("hank","hero 沒有動物只好徒手攻擊");
       }else {
           Log.v("hank","hero 帶了一隻寵物" + animal.getName() + "動物使用：");
           this.animal.cry();
       }
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
