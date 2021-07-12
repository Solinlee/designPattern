package com.solin.designpattern.design;

import com.solin.designpattern.design.singleton.HungryMan;
import com.solin.designpattern.design.singleton.LazyMan;
import com.solin.designpattern.design.singleton.PlainMan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class CountDownLatchTest {

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

    private static Integer tickets = 100;

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(100);
        for(int i=0;i<100;i++) {
            new Thread(() -> {
                sale();
                try{
                    Thread.sleep(new Double(Math.random()*3000).longValue());
//                System.out.println("饿汉： " + HungryMan.getInstance());
//                System.out.println("懒汉： " + LazyMan.getInstance());
//                    System.out.println("普通： " + new PlainMan());
                    countDownLatch.countDown();//计数点
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }).start();
        }
        countDownLatch.await();
           System.out.println(Thread.currentThread().getName()+"开始游戏");

    }

    private static  void  sale(){
        tickets --;
        System.out.println(tickets);
        System.out.println("懒汉： " + LazyMan.getInstance());
    }

}
