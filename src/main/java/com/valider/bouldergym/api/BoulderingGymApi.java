package com.valider.bouldergym.api;

import com.valider.bouldergym.data.dto.GetBoulderingGymRespDto;
import com.valider.bouldergym.service.BoulderingGymService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gym")
public class BoulderingGymApi {
    BoulderingGymService boulderGymService;

    public BoulderingGymApi(BoulderingGymService boulderingGymService)   {
        this.boulderGymService = boulderingGymService;
    }

    @GetMapping("")
    public List<GetBoulderingGymRespDto> getBoulderGym() {
        return boulderGymService
                .getGym()
                .stream()
                .map(GetBoulderingGymRespDto::new)
                .toList();
    }
}
