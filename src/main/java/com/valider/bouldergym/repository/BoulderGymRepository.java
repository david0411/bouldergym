package com.valider.bouldergym.repository;

import com.valider.bouldergym.data.entity.BoulderGymEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BoulderGymRepository extends CrudRepository<BoulderGymEntity, Long> {
    @Query(value = "select * from boulder_gym where location_name = :locationName",nativeQuery = true)
    BoulderGymEntity getBoulderGymByName(String locationName);
}
