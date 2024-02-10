package com.valider.bouldergym.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.valider.bouldergym.data.data.GetBoulderingGymRespData;

public class GetBoulderingGymRespDto {
    @JsonProperty("location_id")
    private Long locationId;
    @JsonProperty("location_name")
    private String locationName;
    @JsonProperty("description")
    private String description;

    public GetBoulderingGymRespDto(GetBoulderingGymRespData getBoulderingGymRespData)   {
        this.locationId = getBoulderingGymRespData.getLocationId();
        this.locationName = getBoulderingGymRespData.getLocationName();
        this.description = getBoulderingGymRespData.getDescription();
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
