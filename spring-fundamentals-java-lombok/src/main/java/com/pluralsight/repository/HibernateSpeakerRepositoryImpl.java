package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
@Profile("dev")
@RequiredArgsConstructor
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    private final Calendar cal;

    @Value("#{T(java.lang.Math).random() * 100.0}")
    private Double seedNum;

    @Override
    public List<Speaker> findAll() {
        Speaker speaker = new Speaker();

        speaker.setFirstName("William");
        speaker.setLastName("Baldoumas");
        speaker.setSeedNum(seedNum);

        List<Speaker> speakers = new ArrayList<>();

        System.out.println("cal:" + cal.getTime());

        speakers.add(speaker);

        return speakers;
    }

}
