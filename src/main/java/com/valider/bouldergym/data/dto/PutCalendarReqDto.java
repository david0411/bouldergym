package com.valider.bouldergym.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class PutCalendarReqDto {
    @JsonProperty("location_name")
    private String locationName;
    @JsonProperty("sub_location_name")
    private String subLocationName;
    @JsonProperty("event_name")
    private String eventName;
    @JsonProperty("event_start_time")
    private Timestamp eventStartTime;
    @JsonProperty("event_end_time")
    private Timestamp eventEndTime;

    public PutCalendarReqDto(String locationName, String subLocationName, String eventName, Timestamp eventStartTime, Timestamp eventEndTime) {
        this.locationName = locationName;
        this.subLocationName = subLocationName;
        this.eventName = eventName;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getSubLocationName() {
        return subLocationName;
    }

    public void setSubLocationName(String subLocationName) {
        this.subLocationName = subLocationName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
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
