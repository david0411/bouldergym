package com.valider.bouldergym.data.data;

import com.valider.bouldergym.data.entity.CalendarActivityEntity;

import java.sql.Timestamp;

public class PutCalendarRespData {
    private Long calendarId;
    private String locationName;
    private String subLocationName;
    private String eventName;
    private Timestamp eventStartTime;
    private Timestamp eventEndTime;

    public PutCalendarRespData(CalendarActivityEntity calendarActivityEntity) {
        this.calendarId = calendarActivityEntity.getCalendarId();
        this.locationName = calendarActivityEntity.getBoulderingGymEntity().getLocationName();
        this.subLocationName = calendarActivityEntity.getSubLocationEntity().getSubLocationName();
        this.eventName = calendarActivityEntity.getEventEntity().getEventName();
        this.eventStartTime = calendarActivityEntity.getEventStartTime();
        this.eventEndTime = calendarActivityEntity.getEventEndTime();
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
