package com.valider.bouldergym.service;

import com.valider.bouldergym.data.entity.SubLocationEntity;

public interface SubLocationService {
    SubLocationEntity getSubLocationByName(String subLocationName);
}
