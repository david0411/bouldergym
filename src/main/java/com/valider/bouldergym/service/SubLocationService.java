package com.valider.bouldergym.service;

import com.valider.bouldergym.data.data.GetSubLocationRespData;
import com.valider.bouldergym.data.entity.SubLocationEntity;

import java.util.List;

public interface SubLocationService {
    List<GetSubLocationRespData> getSubLocation();

    SubLocationEntity getSubLocationByName(String subLocationName);

    SubLocationEntity getSubLocationById(int subLocationId);
}
