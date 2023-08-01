package com.valider.bouldergym.api;

import com.valider.bouldergym.data.data.PutCalendarReqData;
import com.valider.bouldergym.data.dto.GetCalendarByIdRespDto;
import com.valider.bouldergym.data.dto.GetCalendarByMonthRespDto;
import com.valider.bouldergym.data.dto.PutCalendarReqDto;
import com.valider.bouldergym.data.dto.PutCalendarRespDto;
import com.valider.bouldergym.service.CalendarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendar")
public class CalendarApi {
    CalendarService calendarService;

    public CalendarApi(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    @GetMapping("/public/{year}/{month}")
    public List<GetCalendarByMonthRespDto> getCalendarByMonth(@PathVariable Integer year, @PathVariable Integer month) {
        return calendarService
                .getCalendarByMonthData(year, month)
                .stream()
                .map(GetCalendarByMonthRespDto::new)
                .toList();
    }

    @GetMapping("/public/{calendarId}")
    public GetCalendarByIdRespDto getCalendarById(@PathVariable Integer calendarId) {
        return new GetCalendarByIdRespDto(calendarService.getCalendarById(calendarId));
    }

    @PutMapping("/public/add_calendar")
    public PutCalendarRespDto putCalendar(@RequestBody PutCalendarReqDto putCalendarReqDto) {
        return new PutCalendarRespDto(
                calendarService
                        .putCalendar(new PutCalendarReqData(putCalendarReqDto))
        );
    }
}
