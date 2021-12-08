package com.example.c_abstract_animal;

import androidx.appcompat.app.AppCompatActivity;
//*因為你祖先抽象類別不清楚楚,所以我擺明就是要你後代子孫把方法做出來
//abstract class一出來強迫後代子孫要實作他,強迫多形,大家都一樣的方法,但招式各有不同
//抽象目的強迫多型,且保有爸爸的主要方法,還可以再子孫那邊多形m2()方法等
//目的是我仍然保有我的方法,我m1寫得很好你拿去用呀,但我m2()抽象,你要把它做出來
//建構式也可以用抽象,不能直接建構但也有建構式的存在

/*
* abstract可以解釋成“一定會有的東西”，所以只能繼承一次。
*舉實際的例子：武器
武器都一定有攻擊力、攻擊範圍、名字
這時候如果你需要大量的使用到武器，那上述說的『攻擊力、攻擊範圍、名字』這些東西就適合放在abstract。
但武器百百種，可能長槍會有紅櫻、刀和劍會有劍柄而且也可能會有紅櫻、長弓、短弓和十字弓會有弦。
這些東西就不是一定會存在武器內的東西，我們就可以使用interface
 */
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private Animal[] animals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        test1();
        showHero();
    }

    //沒搭配動物的攻擊跟裝上動物的攻擊
    private void showHero() {
        //1.英雄沒搭配動物的攻擊
        Hero hero = new Hero();
        hero.attack();

        //2.生成一隻狗狗
        Animal animal = new Dog();

        //3.搭配狗狗
        hero.setAnimal(animal);

        //4.搭配狗狗後攻擊
        hero.attack();
    }

    //都有繼承動物的多樣性，都是動物,各自叫法,屬性發揚光大而不同
    private void test1() {
        animals = new Animal[]{
                new Dog(),
                new Cat()
        };

        for (Animal animal : animals) {
            Log.v("hank", "我是" + animal.getName() + ",我會這樣");
            animal.cry();
            animal.run();
        }
    }
}