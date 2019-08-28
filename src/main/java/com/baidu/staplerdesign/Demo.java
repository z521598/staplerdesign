package com.baidu.staplerdesign;

import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.StaplerResponse;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static Demo demoInstance = new Demo();

    public Map<String, String> getItems() {
        Map<String, String> items = new HashMap<>();
        items.put("1", "2");
        items.put("2", "3");
        return items;
    }

    public String name = "demo";



    // /hello
    public void doHello(StaplerRequest request, StaplerResponse response ) throws ServletException, IOException {
        System.out.println("lllll");
        response.forward(this,"index",request);

    }
}
