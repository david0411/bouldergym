package com.valider.bouldergym.service.impl;

import com.valider.bouldergym.data.data.GetCalendarByIdRespData;
import com.valider.bouldergym.data.data.GetCalendarByMonthRespData;
import com.valider.bouldergym.data.data.PutCalendarReqData;
import com.valider.bouldergym.data.data.PutCalendarRespData;
import com.valider.bouldergym.data.entity.BoulderGymEntity;
import com.valider.bouldergym.data.entity.CalendarActivityEntity;
import com.valider.bouldergym.data.entity.EventEntity;
import com.valider.bouldergym.data.entity.SubLocationEntity;
import com.valider.bouldergym.repository.CalendarRepository;
import com.valider.bouldergym.service.BoulderGymService;
import com.valider.bouldergym.service.CalendarService;
import com.valider.bouldergym.service.EventService;
import com.valider.bouldergym.service.SubLocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarServiceImpl implements CalendarService {
    CalendarRepository calendarRepository;
    BoulderGymService boulderGymService;
    SubLocationService subLocationService;
    EventService eventService;
    Logger logger = LoggerFactory.getLogger(CalendarServiceImpl.class);

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
        logger.info("Start get Calendar:" +
                " Year:" + year +
                " Month:" + month);
        return calendarRepository
                .getCalendarByMonth(year, month)
                .stream()
                .map(GetCalendarByMonthRespData::new)
                .toList();
    }

    public GetCalendarByIdRespData getCalendarById(Integer calendarId) {
        logger.info("Start get Calendar:" +
                " CalendarId:" + calendarId);
        return new GetCalendarByIdRespData(calendarRepository.getCalendarById(calendarId));
    }

    public PutCalendarRespData putCalendar(PutCalendarReqData putCalendarReqData) {
        logger.info("Start put Calendar:" +
                " GymId:" + putCalendarReqData.getLocationId() +
                " SubId:" + putCalendarReqData.getSubLocationId() +
                " EventId:" + putCalendarReqData.getEventId());
        BoulderGymEntity boulderGymEntity = boulderGymService.getBoulderGymById(putCalendarReqData.getLocationId());
        SubLocationEntity subLocationEntity = subLocationService.getSubLocationById(putCalendarReqData.getSubLocationId());
        EventEntity eventEntity = eventService.getEventById(putCalendarReqData.getEventId());
        return new PutCalendarRespData(
                calendarRepository.save(
                        new CalendarActivityEntity(
                                boulderGymEntity,
                                subLocationEntity,
                                eventEntity,
                                putCalendarReqData.getEventStartTime(),
                                putCalendarReqData.getEventEndTime()
                        )
                )
        );
    }
}
