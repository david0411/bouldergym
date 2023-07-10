package com.valider.bouldergym.service.impl;

import com.valider.bouldergym.data.entity.BoulderGymEntity;
import com.valider.bouldergym.repository.BoulderGymRepository;
import com.valider.bouldergym.service.BoulderGymService;
import org.springframework.stereotype.Service;

@Service
public class BoulderGymServiceImpl implements BoulderGymService {
    BoulderGymRepository boulderGymRepository;

    public BoulderGymServiceImpl(BoulderGymRepository boulderGymRepository) {
        this.boulderGymRepository = boulderGymRepository;
    }

    public BoulderGymEntity getBoulderGymByName(String locationName)    {
        return boulderGymRepository.getBoulderGymByName(locationName);
    }
}
