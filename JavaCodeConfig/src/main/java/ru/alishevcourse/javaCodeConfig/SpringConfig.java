package ru.alishevcourse.javaCodeConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("ru.alishevcourse.javaCodeConfig")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public ChansonMusic chansonMusic() {
        return new ChansonMusic();
    }

    @Bean
    public List<Music> musicList(){
        List<Music> music = Arrays.asList(classicalMusic(), rockMusic(), chansonMusic());
        return music;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer (){
        return new Computer(musicPlayer());
    }
}
