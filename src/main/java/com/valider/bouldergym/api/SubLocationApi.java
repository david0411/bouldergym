package com.valider.bouldergym.api;

import com.valider.bouldergym.data.dto.GetSubLocationRespDto;
import com.valider.bouldergym.service.SubLocationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sub")
public class SubLocationApi {
    SubLocationService subLocationService;

    public SubLocationApi(SubLocationService subLocationService)    {
        this.subLocationService = subLocationService;
    }

    @GetMapping("")
    public List<GetSubLocationRespDto> getSubLocation() {
        return subLocationService
                .getSubLocation()
                .stream()
                .map(GetSubLocationRespDto::new)
                .toList();
    }
}
