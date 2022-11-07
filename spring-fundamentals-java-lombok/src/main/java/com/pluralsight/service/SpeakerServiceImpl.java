package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service("speakerService")
@Profile("dev")
@RequiredArgsConstructor
public class SpeakerServiceImpl implements SpeakerService {

    private final SpeakerRepository speakerRepository;

    // unneeded now that we're using Lombok...
//    public SpeakerServiceImpl() {
//        System.out.println("SpeakerServiceImpl no args constructor");
//    }
//
//    @Autowired
//    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
//        System.out.println("SpeakerServiceImpl repository constructor");
//        this.speakerRepository = speakerRepository;
//    }

    @PostConstruct
    private void initialize() {
        System.out.println("Called after the constructors.");
    }

    @PreDestroy
    private void terminate() {
        System.out.println("Called before the destructors.");
    }

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

    // unneeded now that we're using Lombok
//    public void setRepository(SpeakerRepository repository) {
//        System.out.println("SpeakerServiceImpl setter");
//        this.speakerRepository = repository;
//    }

}
