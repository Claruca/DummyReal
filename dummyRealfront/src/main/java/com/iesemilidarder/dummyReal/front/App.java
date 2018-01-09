package com.iesemilidarder.dummyReal.front;

import com.iesemilidarder.dummyReal.core.DBObject;
import org.apache.commons.lang3.StringUtils;
import java.util.List;
import java.util.ArrayList;
import com.iesemilidarder.dummyReal.core.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;


import static spark.Spark.get;
import static spark.Spark.port;

public class App {
//En esta lista de objetos solo podré poner usuarios. Genéricos.
    private static List<User> lUser = new ArrayList<User>();

    private static final Logger log = LoggerFactory.getLogger(App.class);

    private static void init(){
        for(int i=0;i<10;i++) {
            User user = new User();
            user.setId(123);
            user.setName("a" + i);
            user.save();
            lUser.add(user);
        }
    }

    DBObject dbo = lUser.get(0);

    // Method to check html output or not
    
    private static boolean shouldReturnHtml(Request request) {
        String accept = request.headers("Accept");
        return StringUtils.contains(accept, "text/html");
        // return accept != null && accept.contains("text/html");
    }


    static String data = StringUtils.EMPTY;
    public static void main(String[] args) {
        init();
        port(8080);
        get("/hello", (req, res) -> "Hello World");
        System.out.println(data);


    }

}