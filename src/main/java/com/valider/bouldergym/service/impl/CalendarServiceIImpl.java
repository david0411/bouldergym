package com.valider.bouldergym.service.impl;

import com.valider.bouldergym.data.data.GetCalendarByMonthRespData;
import com.valider.bouldergym.data.entity.CalendarActivityEntity;
import com.valider.bouldergym.repository.CalendarRepository;
import com.valider.bouldergym.service.CalendarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarServiceIImpl implements CalendarService {
    CalendarRepository calendarRepository;

    public CalendarServiceIImpl(CalendarRepository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    public List<GetCalendarByMonthRespData> getCalendarByMonthData(Integer year, Integer month)  {
        List<CalendarActivityEntity> calendarActivityEntityList = calendarRepository.getCalendarByMonth(year, month);
        List<GetCalendarByMonthRespData> getCalendarByMonthRespDataList =
        calendarRepository
                .getCalendarByMonth(year, month)
                .stream()
                .map(GetCalendarByMonthRespData::new)
                .toList();
        return getCalendarByMonthRespDataList;
    }
}
