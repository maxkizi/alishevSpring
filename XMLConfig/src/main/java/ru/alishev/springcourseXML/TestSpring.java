package ru.alishev.springcourseXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusicBean = context.getBean("classicalMusic", ClassicalMusic.class);
        context.getBean("classicalMusic", ClassicalMusic.class);
        context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusicBean.getSong());

       /* MusicPlayer firstMusicPlayerBean = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer secondMusicPlayerBean = context.getBean("musicPlayerBean", MusicPlayer.class);

        System.out.println(firstMusicPlayerBean == secondMusicPlayerBean);
        System.out.println(firstMusicPlayerBean);
        System.out.println(secondMusicPlayerBean);*/

        context.close();


    }
}
