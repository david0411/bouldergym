package com.valider.bouldergym.data.dto;

import com.valider.bouldergym.data.data.GetCalendarByMonthRespData;
import com.valider.bouldergym.data.entity.BoulderGymEntity;
import com.valider.bouldergym.data.entity.EventEntity;
import com.valider.bouldergym.data.entity.SubLocationEntity;

import java.sql.Timestamp;

public class GetCalendarByMonthRespDto {
    private Long calendarId;
    private BoulderGymEntity boulderGymEntity;
    private SubLocationEntity subLocationEntity;
    private EventEntity eventEntity;
    private Timestamp eventStartTime;
    private Timestamp eventEndTime;

    public GetCalendarByMonthRespDto(GetCalendarByMonthRespData getCalendarByMonthRespData) {
        this.calendarId = getCalendarByMonthRespData.getCalendarId();
        this.boulderGymEntity = getCalendarByMonthRespData.getBoulderGymEntity();
        this.subLocationEntity = getCalendarByMonthRespData.getSubLocationEntity();
        this.eventEntity = getCalendarByMonthRespData.getEventEntity();
        this.eventStartTime = getCalendarByMonthRespData.getEventStartTime();
        this.eventEndTime = getCalendarByMonthRespData.getEventEndTime();
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
