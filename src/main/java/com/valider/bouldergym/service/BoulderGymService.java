package com.valider.bouldergym.service;

import com.valider.bouldergym.data.entity.BoulderGymEntity;

public interface BoulderGymService {
    BoulderGymEntity getBoulderGymByName(String locationName);

    BoulderGymEntity getBoulderGymById(int locationId);
}
