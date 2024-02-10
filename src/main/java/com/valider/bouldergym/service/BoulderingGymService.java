package com.valider.bouldergym.service;

import com.valider.bouldergym.data.data.GetBoulderingGymRespData;
import com.valider.bouldergym.data.entity.BoulderingGymEntity;

import java.util.List;

public interface BoulderingGymService {
    List<GetBoulderingGymRespData> getGym();

    BoulderingGymEntity getGymByName(String locationName);

    BoulderingGymEntity getGymById(int locationId);
}
