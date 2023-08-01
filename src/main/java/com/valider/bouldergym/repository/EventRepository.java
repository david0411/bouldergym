package com.valider.bouldergym.repository;

import com.valider.bouldergym.data.entity.EventEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<EventEntity, Long> {
    @Query(value = "select * from event where event_id=:eventId", nativeQuery = true)
    EventEntity getEventById(int eventId);

    @Query(value = "select * from event where event_name=:eventName", nativeQuery = true)
    EventEntity getEventByName(String eventName);
}
