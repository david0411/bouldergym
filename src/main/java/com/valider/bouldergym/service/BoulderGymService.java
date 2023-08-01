package com.valider.bouldergym.service;

import com.valider.bouldergym.data.data.GetBoulderGymRespData;
import com.valider.bouldergym.data.entity.BoulderGymEntity;

import java.util.List;

public interface BoulderGymService {
    List<GetBoulderGymRespData> getBoulderGym();

    BoulderGymEntity getBoulderGymByName(String locationName);

    BoulderGymEntity getBoulderGymById(int locationId);
}
