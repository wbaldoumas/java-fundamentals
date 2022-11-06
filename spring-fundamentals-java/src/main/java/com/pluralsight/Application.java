package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService);

        System.out.println(speakerService.findAll().get(0).getFirstName());

        SpeakerService speakerService2 = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(speakerService2);
    }

}