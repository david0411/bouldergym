package com.valider.bouldergym.repository;

import com.valider.bouldergym.data.entity.BoulderingGymEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BoulderingGymRepository extends CrudRepository<BoulderingGymEntity, Long> {

    @Query(value = "select * from boulder_gym", nativeQuery = true)
    List<BoulderingGymEntity> getGym();
    @Query(value = "select * from boulder_gym where location_id = :locationId",nativeQuery = true)
    BoulderingGymEntity getGymById(int locationId);

    @Query(value = "select * from boulder_gym where location_name = :locationName",nativeQuery = true)
    BoulderingGymEntity getGymByName(String locationName);
}
