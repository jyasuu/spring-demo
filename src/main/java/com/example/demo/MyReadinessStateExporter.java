package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class MyReadinessStateExporter {

    private final static Logger logger = LoggerFactory.getLogger(MyReadinessStateExporter.class);

    @Autowired
    MyBean myBean;

    @EventListener
    public void onStateChange(AvailabilityChangeEvent<ReadinessState> event) {
        ReadinessState newState = event.getState();
        logger.info(myBean.name);

        switch (event.getState()) {
            case ACCEPTING_TRAFFIC -> {
                logger.info("Readiness state changed to: " + newState);
            }
            // create file /tmp/healthy
            case REFUSING_TRAFFIC -> {
                logger.warn("Readiness state changed to: " + newState);
            }
            // remove file /tmp/healthy
        }
    }
}
