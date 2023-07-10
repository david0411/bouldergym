package com.valider.bouldergym.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "event")
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "event_id")
    private Long eventId;
    private String eventName;

    public EventEntity(Long eventId, String eventName) {
        this.eventId = eventId;
        this.eventName = eventName;
    }

    public EventEntity() {
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
