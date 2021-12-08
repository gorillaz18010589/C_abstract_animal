package com.example.c_abstract_animal;
//*因為你祖先抽象類別不清楚楚,所以我擺明就是要你後代子孫把方法做出來
//abstract class一出來強迫後代子孫要實作他,強迫多形,大家都一樣的方法,但招式各有不同
//抽象目的強迫多型,且保有爸爸的主要方法,還可以再子孫那邊多形m2()方法等
//目的是我仍然保有我的方法,我m1寫得很好你拿去用呀,但我m2()抽象,你要把它做出來
//建構式也可以用抽象,不能直接建構但也有建構式的存在

//動物會做的行為讓後代發揚光大
abstract class Animal {
    abstract String getName();

    abstract void cry();

    abstract void run();
}
