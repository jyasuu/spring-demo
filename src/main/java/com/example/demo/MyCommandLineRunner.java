package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    private final static Logger logger = LoggerFactory.getLogger(MyCommandLineRunner.class);
    @Override
    public void run(String... args) {
        logger.info(Arrays.toString(args));
        // Do something...
    }

}

