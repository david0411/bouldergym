package com.valider.bouldergym.repository;

import com.valider.bouldergym.data.entity.CalendarActivityEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CalendarRepository extends CrudRepository<CalendarActivityEntity, Long> {

    @Query(value = "select * from calendar_activity " +
            "where Year(event_start_time) = :year " +
            "and MONTH(event_start_time) = :month", nativeQuery = true)
    List<CalendarActivityEntity> getCalendarByMonth(Integer year, Integer month);

    @Query(value = "select * from calendar_activity " +
            "where calendar_activity.calendar_id = :calendarId", nativeQuery = true)
    CalendarActivityEntity getCalendarById(Integer calendarId);
}


