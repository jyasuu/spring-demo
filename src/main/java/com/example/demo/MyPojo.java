package com.example.demo;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

@Data
@ToString
@Getter
@Setter
public class MyPojo {
    @NotNull
    private String name;
    @NotNull
    private String description;

}
