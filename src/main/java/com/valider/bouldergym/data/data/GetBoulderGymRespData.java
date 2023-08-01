package com.valider.bouldergym.data.data;

import com.valider.bouldergym.data.entity.BoulderGymEntity;

public class GetBoulderGymRespData {
    private Long locationId;
    private String locationName;
    private String description;

    public GetBoulderGymRespData(BoulderGymEntity boulderGymEntity) {
        this.locationId = boulderGymEntity.getLocationId();
        this.locationName = boulderGymEntity.getLocationName();
        this.description = boulderGymEntity.getDescription();
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
