package com.baidu.staplerdesign;

import org.kohsuke.stapler.Stapler;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class WebAppMain implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Stapler.setRoot(sce, Demo.demoInstance);
    }
}
