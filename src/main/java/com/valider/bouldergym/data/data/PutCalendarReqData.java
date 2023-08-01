package com.valider.bouldergym.data.data;

import com.valider.bouldergym.data.dto.PutCalendarReqDto;

import java.sql.Timestamp;

public class PutCalendarReqData {
    private int locationId;
    private int subLocationId;
    private int eventId;
    private Timestamp eventStartTime;
    private Timestamp eventEndTime;

    public PutCalendarReqData(PutCalendarReqDto putCalendarReqDto) {
        this.locationId = putCalendarReqDto.getLocationId();
        this.subLocationId = putCalendarReqDto.getSubLocationId();
        this.eventId = putCalendarReqDto.getEventId();
        this.eventStartTime = putCalendarReqDto.getEventStartTime();
        this.eventEndTime = putCalendarReqDto.getEventEndTime();
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
