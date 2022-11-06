package com.pluralsight;

import com.pluralsight.model.Speaker;
import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);

        //SpeakerService service = new SpeakerServiceImpl();

        System.out.println(speakerService.findAll().get(0).getFirstName());
    }

}