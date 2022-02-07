package org.domain;

import java.util.Date;

public class User {
    public String sayHi(String name){
        System.out.println("execute User name");
        return name + " hello" + new Date();
    }
}
