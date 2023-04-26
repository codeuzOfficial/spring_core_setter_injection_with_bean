package dasturlash.uz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Lesson lesson = (Lesson) context.getBean("lesson");

        System.out.println(lesson);
    }
}