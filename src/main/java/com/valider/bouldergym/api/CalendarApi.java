package com.valider.bouldergym.api;

import com.valider.bouldergym.data.data.GetCalendarByMonthRespData;
import com.valider.bouldergym.data.dto.GetCalendarByMonthRespDto;
import com.valider.bouldergym.service.CalendarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/public")
public class CalendarApi {
    CalendarService calendarService;

    @GetMapping("/{month}")
    public List<GetCalendarByMonthRespDto> getCalendarByMonth(@PathVariable Integer month)  {
        return calendarService.getCalendarByMonthData(month).stream().map(GetCalendarByMonthRespDto::new).toList();
    }
}
