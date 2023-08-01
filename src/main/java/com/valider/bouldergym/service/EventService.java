package com.valider.bouldergym.service;

import com.valider.bouldergym.data.entity.EventEntity;

public interface EventService {
    EventEntity getEventByName(String eventName);

    EventEntity getEventById(int eventId);
}
