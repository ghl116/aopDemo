package com.ghl.aoptest;

public class Minstrel {
    public void beforSay(){
        System.out.println("前置通知 xml");
    }
    
    public void afterSay(){
        System.out.println("后置通知 xml");
    }
}