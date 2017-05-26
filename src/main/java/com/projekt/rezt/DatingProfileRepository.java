package com.projekt.rezt;


import org.springframework.data.repository.CrudRepository;

public interface DatingProfileRepository extends CrudRepository<DatingProfile, Long> {

    Iterable<DatingProfile> findByEnergyDrinksConsumedPerWeekBetween(Integer first, Integer second);

    Iterable<DatingProfile> findByLengthAfter(Integer length);

    Iterable<DatingProfile> findByGamingHoursPerWeekBetween(double first, double second);

}
