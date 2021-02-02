package ru.alishevcourse.javaCodeConfig;

import org.springframework.stereotype.Component;


public class ClassicalMusic  implements Music{
    @Override
    public String getSong() {
        return "Hungarian rhapsody";
    }
}
