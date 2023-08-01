package com.valider.bouldergym.service;

import com.valider.bouldergym.data.data.GetEventRespData;
import com.valider.bouldergym.data.entity.EventEntity;

import java.util.List;

public interface EventService {
    List<GetEventRespData> getEvent();

    EventEntity getEventByName(String eventName);

    EventEntity getEventById(int eventId);
}
