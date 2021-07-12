package com.solin.designpattern.design;

import com.solin.designpattern.design.singleton.HungryMan;
import com.solin.designpattern.design.singleton.LazyMan;
import com.solin.designpattern.design.singleton.PlainMan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SingletonTest {

    @Test
    public void testsingleton(){

        System.out.println("---饿汉式---初始化");
        HungryMan hungryMan = null;
        for (int i = 0; i < 5; i++) {
            hungryMan = HungryMan.getInstance();
            System.out.println(hungryMan);
        }

        System.out.println("---懒汉式---初始化");
        LazyMan lazyMan = null;
        for (int i = 0; i < 5; i++) {
            lazyMan = LazyMan.getInstance();
            System.out.println(lazyMan);
        }

        System.out.println("---普通式---初始化");
        PlainMan plainMan = null;
        for (int i = 0; i < 5; i++) {
            plainMan=new PlainMan();
            System.out.println(plainMan);
        }

    }

    public static void main(String[] args) {
        System.out.println(1);
    }

}
