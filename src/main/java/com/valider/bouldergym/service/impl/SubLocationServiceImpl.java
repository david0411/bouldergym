package com.valider.bouldergym.service.impl;

import com.valider.bouldergym.data.entity.SubLocationEntity;
import com.valider.bouldergym.repository.SubLocationRepository;
import com.valider.bouldergym.service.SubLocationService;
import org.springframework.stereotype.Service;

@Service
public class SubLocationServiceImpl implements SubLocationService {
    SubLocationRepository subLocationRepository;

    public SubLocationServiceImpl(SubLocationRepository subLocationRepository) {
        this.subLocationRepository = subLocationRepository;
    }

    public SubLocationEntity getSubLocationByName(String subLocationName) {
        return subLocationRepository.getSubLocationByName(subLocationName);
    }
}
