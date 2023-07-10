package com.valider.bouldergym.service;

import com.valider.bouldergym.data.data.GetCalendarByMonthRespData;

import java.util.List;

public interface CalendarService {
    List<GetCalendarByMonthRespData> getCalendarByMonthData(Integer month);
}
