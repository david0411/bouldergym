package com.valider.bouldergym.repository;

import com.valider.bouldergym.data.entity.SubLocationEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SubLocationRepository extends CrudRepository<SubLocationEntity, Long> {
    @Query(value = "select * from sub_location where sub_location_id = :subLocationId", nativeQuery = true)
    SubLocationEntity getSubLocationById(int subLocationId);

    @Query(value = "select * from sub_location where sub_location_name = :subLocationName", nativeQuery = true)
    SubLocationEntity getSubLocationByName(String subLocationName);
}
