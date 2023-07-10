package com.valider.bouldergym.service.impl;

import com.valider.bouldergym.data.entity.EventEntity;
import com.valider.bouldergym.repository.EventRepository;
import com.valider.bouldergym.service.EventService;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {
    EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public EventEntity getEventByName(String eventName) {
        return eventRepository.getEventByName(eventName);
    }
}
