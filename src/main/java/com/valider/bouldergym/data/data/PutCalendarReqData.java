package com.valider.bouldergym.data.data;

import com.valider.bouldergym.data.dto.PutCalendarReqDto;
import com.valider.bouldergym.data.entity.CalendarActivityEntity;

import java.sql.Timestamp;

public class PutCalendarReqData {
    private String locationName;
    private String subLocationName;
    private String eventName;
    private Timestamp eventStartTime;
    private Timestamp eventEndTime;

    public PutCalendarReqData(PutCalendarReqDto putCalendarReqDto) {
        this.locationName = putCalendarReqDto.getLocationName();
        this.subLocationName = putCalendarReqDto.getSubLocationName();
        this.eventName = putCalendarReqDto.getEventName();
        this.eventStartTime = putCalendarReqDto.getEventStartTime();
        this.eventEndTime = putCalendarReqDto.getEventEndTime();
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
