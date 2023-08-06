package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class MyBean {

    private final static Logger logger = LoggerFactory.getLogger(MyBean.class);

    @Value("${name}")
    public String name;

    @Autowired
    public MyBean(ApplicationArguments args,MyProperties myProperties) {
        boolean debug = args.containsOption("debug");
        List<String> files = args.getNonOptionArgs();
        logger.info(name);
        logger.info(myProperties.getList().toString());
        logger.info(myProperties.getMap().toString());
        logger.info(files.toString());
        if (debug) {
            logger.info(files.toString());
        }
        // if run with "--debug logfile.txt" prints ["logfile.txt"]
    }

}

