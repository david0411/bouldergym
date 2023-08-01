package com.valider.bouldergym.data.data;

import com.valider.bouldergym.data.entity.SubLocationEntity;

public class GetSubLocationRespData {
    private Long subLocationId;
    private String subLocationName;
    private Long locationId;

    public GetSubLocationRespData(SubLocationEntity subLocationEntity)   {
        this.subLocationId = subLocationEntity.getSubLocationId();
        this.subLocationName = subLocationEntity.getSubLocationName();
        this.locationId = subLocationEntity.getBoulderGymEntity().getLocationId();
    }

    public Long getSubLocationId() {
        return subLocationId;
    }

    public void setSubLocationId(Long subLocationId) {
        this.subLocationId = subLocationId;
    }

    public String getSubLocationName() {
        return subLocationName;
    }

    public void setSubLocationName(String subLocationName) {
        this.subLocationName = subLocationName;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }
}
