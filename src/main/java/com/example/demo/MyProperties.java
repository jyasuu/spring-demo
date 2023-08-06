package com.example.demo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jakarta.validation.Valid;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties("my")
@Validated
public class MyProperties {
    @Valid
    private final Map<String, MyPojo> map = new LinkedHashMap<>();
    @Valid
    private final List<MyPojo> list = new ArrayList<>();

    public List<MyPojo> getList() {
        return this.list;
    }
    public Map<String, MyPojo> getMap() {
        return this.map;
    }

}

