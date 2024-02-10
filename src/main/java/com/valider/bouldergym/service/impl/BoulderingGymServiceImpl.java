package com.valider.bouldergym.service.impl;

import com.valider.bouldergym.data.data.GetBoulderingGymRespData;
import com.valider.bouldergym.data.entity.BoulderingGymEntity;
import com.valider.bouldergym.repository.BoulderingGymRepository;
import com.valider.bouldergym.service.BoulderingGymService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoulderingGymServiceImpl implements BoulderingGymService {
    BoulderingGymRepository boulderingGymRepository;
    Logger logger = LoggerFactory.getLogger(BoulderingGymServiceImpl.class);

    public BoulderingGymServiceImpl(BoulderingGymRepository boulderingGymRepository) {
        this.boulderingGymRepository = boulderingGymRepository;
    }

    public List<GetBoulderingGymRespData> getGym() {
        logger.info("Start get All Gym.");
        return boulderingGymRepository
                .getGym()
                .stream()
                .map(GetBoulderingGymRespData::new)
                .toList();
    }

    public BoulderingGymEntity getGymByName(String locationName)    {
        logger.info("Start get Gym: " + " GymName: " + locationName);
        return boulderingGymRepository.getGymByName(locationName);
    }

    public BoulderingGymEntity getGymById(int locationId)    {
        logger.info("Start get Gym: " + " GymId: " + locationId);
        return boulderingGymRepository.getGymById(locationId);
    }
}
