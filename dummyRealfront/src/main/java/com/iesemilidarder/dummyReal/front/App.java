package com.iesemilidarder.dummyReal.front;

import org.apache.commons.lang3.StringUtils;
import java.util.List;
import java.util.ArrayList;
import com.iesemilidarder.dummyReal.core.User;


import static spark.Spark.get;
import static spark.Spark.port;

public class App {
//En esta lista de objetos solo podré poner usuarios. Genéricos.
    private static List<User> lUser = new ArrayList<User>();

    private static void init(){
        for(int i=0;i<10;i++) {
            User user = new User();
            user.setId(123);
            user.setName("a" + i);
            user.save();
            lUser.add(user);
        }
    }

    static String data = StringUtils.EMPTY;
    public static void main(String[] args) {
        init();
        port(8080);
        get("/hello", (req, res) -> "Hello World");
        System.out.println(data);


    }

}