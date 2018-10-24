package com.ghl.aoptest.service.impl;

import com.ghl.aoptest.service.PersonService;

public class PersonServiceImpl implements PersonService {

    public void save(String name) {
        System.out.println("我是save()方法");
    }

    public void update(String name, Integer id) {
        System.out.println("我是update()方法");
    }

    public String getPersonName(Integer id) {
        System.out.println("我是getPersonName()方法");
        return "xxx";
    }

}