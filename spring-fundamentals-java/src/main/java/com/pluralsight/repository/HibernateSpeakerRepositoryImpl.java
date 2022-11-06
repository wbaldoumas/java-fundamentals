package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        Speaker speaker = new Speaker();

        speaker.setFirstName("William");
        speaker.setLastName("Baldoumas");

        List<Speaker> speakers = new ArrayList<>();

        speakers.add(speaker);

        return speakers;
    }

}
