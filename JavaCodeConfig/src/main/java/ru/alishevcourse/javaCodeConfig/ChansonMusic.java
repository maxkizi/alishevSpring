package ru.alishevcourse.javaCodeConfig;

import org.springframework.stereotype.Component;


public class ChansonMusic implements Music {
    @Override
    public String getSong() {
        return "Кольщик";
    }
}
