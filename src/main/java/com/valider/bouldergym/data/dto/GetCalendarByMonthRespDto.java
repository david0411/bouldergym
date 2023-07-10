package com.valider.bouldergym.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.valider.bouldergym.data.data.GetCalendarByMonthRespData;
import com.valider.bouldergym.data.entity.BoulderGymEntity;
import com.valider.bouldergym.data.entity.EventEntity;
import com.valider.bouldergym.data.entity.SubLocationEntity;

import java.sql.Timestamp;

public class GetCalendarByMonthRespDto {
    @JsonProperty("calendar_id")
    private Long calendarId;
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

    public GetCalendarByMonthRespDto(GetCalendarByMonthRespData getCalendarByMonthRespData) {
        this.calendarId = getCalendarByMonthRespData.getCalendarId();
        this.locationName = getCalendarByMonthRespData.getLocationName();
        this.subLocationName = getCalendarByMonthRespData.getSubLocationName();
        this.eventName = getCalendarByMonthRespData.getEventName();
        this.eventStartTime = getCalendarByMonthRespData.getEventStartTime();
        this.eventEndTime = getCalendarByMonthRespData.getEventEndTime();
    }

    public Long getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(Long calendarId) {
        this.calendarId = calendarId;
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
