package com.projekt.rezt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatingProfileController {

    @Autowired
    private DatingProfileRepository datingProfileRepository;

    @GetMapping(value = "/profiles")
    public Iterable<DatingProfile> findDatingProfiles() {
        return datingProfileRepository.findAll();
    }

    @PostMapping(value = "/add")
    public String addDatingProfile(@RequestBody DatingProfile datingProfile) {
        datingProfileRepository.save(datingProfile);
        return "Dating Profile Successfully Saved";
    }
}


