package com.valider.bouldergym.api;

import com.valider.bouldergym.data.dto.GetEventRespDto;
import com.valider.bouldergym.service.EventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventApi {
    EventService eventService;

    public EventApi(EventService eventService)    {
        this.eventService = eventService;
    }

    @GetMapping("")
    public List<GetEventRespDto> getEvent() {
        return eventService
                .getEvent()
                .stream()
                .map(GetEventRespDto::new)
                .toList();
    }
}
