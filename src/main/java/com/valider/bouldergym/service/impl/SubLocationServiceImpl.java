package com.valider.bouldergym.service.impl;

import com.valider.bouldergym.data.data.GetSubLocationRespData;
import com.valider.bouldergym.data.entity.SubLocationEntity;
import com.valider.bouldergym.repository.SubLocationRepository;
import com.valider.bouldergym.service.SubLocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubLocationServiceImpl implements SubLocationService {
    SubLocationRepository subLocationRepository;
    Logger logger = LoggerFactory.getLogger(SubLocationServiceImpl.class);

    public SubLocationServiceImpl(SubLocationRepository subLocationRepository) {
        this.subLocationRepository = subLocationRepository;
    }

    public List<GetSubLocationRespData> getSubLocation() {
        logger.info("Start get All SubLocation.");
        return subLocationRepository
                .getSubLocation()
                .stream()
                .map(GetSubLocationRespData::new)
                .toList();
    }

    public SubLocationEntity getSubLocationByName(String subLocationName) {
        logger.info("Start get SubLocation: " + " SubName: " + subLocationName);
        return subLocationRepository.getSubLocationByName(subLocationName);
    }
    public SubLocationEntity getSubLocationById(int subLocationId) {
        logger.info("Start get SubLocation: " + " SubId: " + subLocationId);
        return subLocationRepository.getSubLocationById(subLocationId);
    }
}
