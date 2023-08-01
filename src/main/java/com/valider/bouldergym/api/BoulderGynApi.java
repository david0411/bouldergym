package com.valider.bouldergym.api;

import com.valider.bouldergym.data.dto.GetBoulderGymRespDto;
import com.valider.bouldergym.service.BoulderGymService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gym")
public class BoulderGynApi {
    BoulderGymService boulderGymService;

    public BoulderGynApi(BoulderGymService boulderGymService)   {
        this.boulderGymService = boulderGymService;
    }

    @GetMapping("")
    public List<GetBoulderGymRespDto> getBoulderGym() {
        return boulderGymService
                .getBoulderGym()
                .stream()
                .map(GetBoulderGymRespDto::new)
                .toList();
    }
}
