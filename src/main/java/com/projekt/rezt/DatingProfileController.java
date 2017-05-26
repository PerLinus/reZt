package com.projekt.rezt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/searchByDrinks/{first}/{second}")
    public Iterable<DatingProfile> findProfileByDrinks(@RequestBody @PathVariable("first") Integer first, @PathVariable("second") Integer second) {
        return datingProfileRepository.findByEnergyDrinksConsumedPerWeekBetween(first, second);
    }

    @GetMapping(value = "/searchByLength/{length}")
    public Iterable<DatingProfile> findProfileByLength(@RequestBody @PathVariable("length") Integer length) {
        return datingProfileRepository.findByLengthAfter(length);
    }

    @GetMapping(value = "/searchByGamingHours/{first}/{second}")
    public Iterable<DatingProfile> findProfileByGamingHours(@RequestBody @PathVariable("first") double first, @PathVariable("second") double second) {
        return datingProfileRepository.findByGamingHoursPerWeekBetween(first, second);
    }

    @GetMapping(value = "searchByRagerAndAge/{isRager}/{ageMin}/{ageMax}")
    public Iterable<DatingProfile> findProfileByRagerAndAge(@RequestBody @PathVariable("isRager") boolean isRager,
                                                            @PathVariable("ageMin") Integer ageMin,
                                                            @PathVariable("ageMax") Integer ageMax){
        return datingProfileRepository.findByRagerAndAgeBetween(isRager, ageMin, ageMax);
    }

}


