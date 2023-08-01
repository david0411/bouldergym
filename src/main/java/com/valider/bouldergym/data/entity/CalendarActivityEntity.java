package com.valider.bouldergym.data.entity;


import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "calendar_activity")
public class CalendarActivityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long calendarId;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private BoulderGymEntity boulderGymEntity;
    @ManyToOne
    @JoinColumn(name = "sub_location_id")
    private SubLocationEntity subLocationEntity;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private EventEntity eventEntity;
    @Column(name = "event_start_time")
    private Timestamp eventStartTime;
    @Column(name = "event_end_time")
    private Timestamp eventEndTime;

    public CalendarActivityEntity() {
    }

    public CalendarActivityEntity(BoulderGymEntity boulderGymEntity, SubLocationEntity subLocationEntity, EventEntity eventEntity, Timestamp eventStartTime, Timestamp eventEndTime) {
        this.calendarId = null;
        this.boulderGymEntity = boulderGymEntity;
        this.subLocationEntity = subLocationEntity;
        this.eventEntity = eventEntity;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
    }

    public Timestamp getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(Timestamp eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public Timestamp getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(Timestamp eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    public Long getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(Long calendarId) {
        this.calendarId = calendarId;
    }

    public BoulderGymEntity getBoulderGymEntity() {
        return boulderGymEntity;
    }

    public void setBoulderGymEntity(BoulderGymEntity boulderGymEntity) {
        this.boulderGymEntity = boulderGymEntity;
    }

    public SubLocationEntity getSubLocationEntity() {
        return subLocationEntity;
    }

    public void setSubLocationEntity(SubLocationEntity subLocationEntity) {
        this.subLocationEntity = subLocationEntity;
    }
    public EventEntity getEventEntity() {
        return eventEntity;
    }

    public void setEventEntity(EventEntity eventEntity) {
        this.eventEntity = eventEntity;
    }
}
