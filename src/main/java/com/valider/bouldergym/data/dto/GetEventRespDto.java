package com.valider.bouldergym.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.valider.bouldergym.data.data.GetEventRespData;

public class GetEventRespDto {
    @JsonProperty("event_id")
    private Long eventId;
    @JsonProperty("event_name")
    private String eventName;

    public GetEventRespDto (GetEventRespData getEventRespData)  {
        this.eventId = getEventRespData.getEventId();
        this.eventName = getEventRespData.getEventName();
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
