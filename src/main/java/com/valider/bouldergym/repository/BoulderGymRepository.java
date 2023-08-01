package com.valider.bouldergym.repository;

import com.valider.bouldergym.data.entity.BoulderGymEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BoulderGymRepository extends CrudRepository<BoulderGymEntity, Long> {

    @Query(value = "select * from boulder_gym", nativeQuery = true)
    List<BoulderGymEntity> getBoulderGym();
    @Query(value = "select * from boulder_gym where location_id = :locationId",nativeQuery = true)
    BoulderGymEntity getBoulderGymById(int locationId);

    @Query(value = "select * from boulder_gym where location_name = :locationName",nativeQuery = true)
    BoulderGymEntity getBoulderGymByName(String locationName);
}
