package com.valider.bouldergym.api;

import com.valider.bouldergym.data.dto.GetCalendarByMonthRespDto;
import com.valider.bouldergym.service.CalendarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/public")
public class CalendarApi {
    CalendarService calendarService;

    public CalendarApi(CalendarService calendarService) {
        this.calendarService = calendarService;
    }
    @GetMapping("/{year}/{month}")
    public List<GetCalendarByMonthRespDto> getCalendarByMonth(@PathVariable Integer year, @PathVariable Integer month)  {
        return calendarService
                .getCalendarByMonthData(year, month)
                .stream()
                .map(GetCalendarByMonthRespDto::new)
                .toList();
    }
}
