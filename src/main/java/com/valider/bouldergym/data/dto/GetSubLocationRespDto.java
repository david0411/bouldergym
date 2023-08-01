package com.valider.bouldergym.data.dto;

import com.valider.bouldergym.data.data.GetSubLocationRespData;

public class GetSubLocationRespDto {
    private Long subLocationId;
    private String subLocationName;
    private Long locationId;

    public GetSubLocationRespDto(GetSubLocationRespData getSubLocationRespData)  {
        this.subLocationId = getSubLocationRespData.getSubLocationId();
        this.subLocationName = getSubLocationRespData.getSubLocationName();
        this.locationId = getSubLocationRespData.getLocationId();
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
