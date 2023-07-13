package com.valider.bouldergym.service.impl;

import com.valider.bouldergym.data.data.GetCalendarByMonthRespData;
import com.valider.bouldergym.data.data.PutCalendarReqData;
import com.valider.bouldergym.data.data.PutCalendarRespData;
import com.valider.bouldergym.data.entity.CalendarActivityEntity;
import com.valider.bouldergym.repository.CalendarRepository;
import com.valider.bouldergym.service.BoulderGymService;
import com.valider.bouldergym.service.CalendarService;
import com.valider.bouldergym.service.EventService;
import com.valider.bouldergym.service.SubLocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarServiceImpl implements CalendarService {
    CalendarRepository calendarRepository;
    BoulderGymService boulderGymService;
    SubLocationService subLocationService;
    EventService eventService;

    public CalendarServiceImpl(
            CalendarRepository calendarRepository,
            BoulderGymService boulderGymService,
            SubLocationService subLocationService,
            EventService eventService) {
        this.calendarRepository = calendarRepository;
        this.boulderGymService = boulderGymService;
        this.subLocationService = subLocationService;
        this.eventService = eventService;
    }

    public List<GetCalendarByMonthRespData> getCalendarByMonthData(Integer year, Integer month) {
        return calendarRepository
                .getCalendarByMonth(year, month)
                .stream()
                .map(GetCalendarByMonthRespData::new)
                .toList();
    }


    public PutCalendarRespData putCalendar(PutCalendarReqData putCalendarReqData) {
        return new PutCalendarRespData(
                calendarRepository.save(
                        new CalendarActivityEntity(
                                boulderGymService.getBoulderGymByName(putCalendarReqData.getLocationName()),
                                subLocationService.getSubLocationByName(putCalendarReqData.getSubLocationName()),
                                eventService.getEventByName(putCalendarReqData.getEventName()),
                                putCalendarReqData.getEventStartTime(),
                                putCalendarReqData.getEventEndTime()
                        )
                )
        );
    }
}
