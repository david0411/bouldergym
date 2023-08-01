package com.valider.bouldergym.data.data;

import com.valider.bouldergym.data.entity.EventEntity;

public class GetEventRespData {
    private Long eventId;
    private String eventName;

    public GetEventRespData(EventEntity eventEntity)    {
        this.eventId = eventEntity.getEventId();
        this.eventName = eventEntity.getEventName();
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
