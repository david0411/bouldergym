package com.valider.bouldergym.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class PutCalendarReqDto {
    @JsonProperty("location_id")
    private int locationId;
    @JsonProperty("sub_location_id")
    private int subLocationId;
    @JsonProperty("event_id")
    private int eventId;
    @JsonProperty("event_start_time")
    private Timestamp eventStartTime;
    @JsonProperty("event_end_time")
    private Timestamp eventEndTime;

    public PutCalendarReqDto(int locationId, int subLocationId, int eventId, Timestamp eventStartTime, Timestamp eventEndTime) {
        this.locationId = locationId;
        this.subLocationId = subLocationId;
        this.eventId = eventId;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getSubLocationId() {
        return subLocationId;
    }

    public void setSubLocationId(int subLocationId) {
        this.subLocationId = subLocationId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
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
}
