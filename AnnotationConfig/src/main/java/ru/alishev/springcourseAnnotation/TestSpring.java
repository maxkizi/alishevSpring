package ru.alishev.springcourseAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Neil Alishev
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

       /* Music rockMusic = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(rockMusic);*/

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName() + ", " + musicPlayer.getVolume());
        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic1);
        System.out.println(classicalMusic);

        context.close();


    }
}
