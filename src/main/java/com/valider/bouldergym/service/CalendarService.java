package com.valider.bouldergym.service;

import com.valider.bouldergym.data.data.GetCalendarByMonthRespData;
import com.valider.bouldergym.data.data.PutCalendarReqData;
import com.valider.bouldergym.data.data.PutCalendarRespData;

import java.util.List;

public interface CalendarService {
    List<GetCalendarByMonthRespData> getCalendarByMonthData(Integer year, Integer month);

    PutCalendarRespData putCalendar(PutCalendarReqData putCalendarReqData);
}
