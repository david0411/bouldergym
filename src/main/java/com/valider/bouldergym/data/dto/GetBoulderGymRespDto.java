package com.valider.bouldergym.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.valider.bouldergym.data.data.GetBoulderGymRespData;

public class GetBoulderGymRespDto {
    @JsonProperty("location_id")
    private Long locationId;
    @JsonProperty("location_name")
    private String locationName;
    @JsonProperty("description")
    private String description;

    public GetBoulderGymRespDto(GetBoulderGymRespData getBoulderGymRespData)   {
        this.locationId = getBoulderGymRespData.getLocationId();
        this.locationName = getBoulderGymRespData.getLocationName();
        this.description = getBoulderGymRespData.getDescription();
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
