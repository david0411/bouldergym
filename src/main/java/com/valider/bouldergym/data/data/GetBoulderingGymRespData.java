package com.valider.bouldergym.data.data;

import com.valider.bouldergym.data.entity.BoulderingGymEntity;

public class GetBoulderingGymRespData {
    private Long locationId;
    private String locationName;
    private String description;

    public GetBoulderingGymRespData(BoulderingGymEntity boulderingGymEntity) {
        this.locationId = boulderingGymEntity.getLocationId();
        this.locationName = boulderingGymEntity.getLocationName();
        this.description = boulderingGymEntity.getDescription();
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
