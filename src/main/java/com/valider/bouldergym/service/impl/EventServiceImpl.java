package com.valider.bouldergym.service.impl;

import com.valider.bouldergym.data.entity.EventEntity;
import com.valider.bouldergym.repository.EventRepository;
import com.valider.bouldergym.service.EventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {
    EventRepository eventRepository;
    Logger logger = LoggerFactory.getLogger(EventServiceImpl.class);

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public EventEntity getEventByName(String eventName) {
        logger.info("Start get Event:" + " EventName: " + eventName);
        return eventRepository.getEventByName(eventName);
    }

    public EventEntity getEventById(int eventId) {
        logger.info("Start get Event:" + " EventId: " + eventId);
        return eventRepository.getEventById(eventId);
    }
}
