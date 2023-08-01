package com.valider.bouldergym.service.impl;

import com.valider.bouldergym.data.entity.BoulderGymEntity;
import com.valider.bouldergym.repository.BoulderGymRepository;
import com.valider.bouldergym.service.BoulderGymService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BoulderGymServiceImpl implements BoulderGymService {
    BoulderGymRepository boulderGymRepository;
    Logger logger = LoggerFactory.getLogger(BoulderGymServiceImpl.class);

    public BoulderGymServiceImpl(BoulderGymRepository boulderGymRepository) {
        this.boulderGymRepository = boulderGymRepository;
    }

    public BoulderGymEntity getBoulderGymByName(String locationName)    {
        logger.info("Start get Gym:" + " GymName: " + locationName);
        return boulderGymRepository.getBoulderGymByName(locationName);
    }

    public BoulderGymEntity getBoulderGymById(int locationId)    {
        logger.info("Start get Gym:" + " GymId: " + locationId);
        return boulderGymRepository.getBoulderGymById(locationId);
    }
}
